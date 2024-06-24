// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarSceneQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<CarSceneQueryResponseBodyModule> module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static CarSceneQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CarSceneQueryResponseBody self = new CarSceneQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public CarSceneQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CarSceneQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CarSceneQueryResponseBody setModule(java.util.List<CarSceneQueryResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<CarSceneQueryResponseBodyModule> getModule() {
        return this.module;
    }

    public CarSceneQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CarSceneQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CarSceneQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CarSceneQueryResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>travel</p>
         */
        @NameInMap("scenarioTemplateId")
        public String scenarioTemplateId;

        @NameInMap("scenarioTemplateName")
        public String scenarioTemplateName;

        /**
         * <strong>example:</strong>
         * <p>ACTIVATE</p>
         */
        @NameInMap("state")
        public String state;

        public static CarSceneQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CarSceneQueryResponseBodyModule self = new CarSceneQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CarSceneQueryResponseBodyModule setScenarioTemplateId(String scenarioTemplateId) {
            this.scenarioTemplateId = scenarioTemplateId;
            return this;
        }
        public String getScenarioTemplateId() {
            return this.scenarioTemplateId;
        }

        public CarSceneQueryResponseBodyModule setScenarioTemplateName(String scenarioTemplateName) {
            this.scenarioTemplateName = scenarioTemplateName;
            return this;
        }
        public String getScenarioTemplateName() {
            return this.scenarioTemplateName;
        }

        public CarSceneQueryResponseBodyModule setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
