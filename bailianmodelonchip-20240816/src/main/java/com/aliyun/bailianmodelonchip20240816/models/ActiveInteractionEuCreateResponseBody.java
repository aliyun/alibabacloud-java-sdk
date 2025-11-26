// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class ActiveInteractionEuCreateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ActiveInteractionEuCreateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>84656A01-32F0-5D12-8C72-E3AFAA0C8A29</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ActiveInteractionEuCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActiveInteractionEuCreateResponseBody self = new ActiveInteractionEuCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public ActiveInteractionEuCreateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ActiveInteractionEuCreateResponseBody setData(ActiveInteractionEuCreateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ActiveInteractionEuCreateResponseBodyData getData() {
        return this.data;
    }

    public ActiveInteractionEuCreateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ActiveInteractionEuCreateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ActiveInteractionEuCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActiveInteractionEuCreateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ActiveInteractionEuCreateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>point</p>
         */
        @NameInMap("gesture")
        public String gesture;

        /**
         * <strong>example:</strong>
         * <p>A man in dark clothing stands on a rocky hilltop, facing away from the camera, gazing at the expansive view with a contemplative posture.</p>
         */
        @NameInMap("person")
        public String person;

        /**
         * <strong>example:</strong>
         * <p>Mountainous landscape with layered ridges receding into haze, under a vast blue sky with wispy clouds and soft golden light near the horizon.</p>
         */
        @NameInMap("scene")
        public String scene;

        public static ActiveInteractionEuCreateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ActiveInteractionEuCreateResponseBodyData self = new ActiveInteractionEuCreateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ActiveInteractionEuCreateResponseBodyData setGesture(String gesture) {
            this.gesture = gesture;
            return this;
        }
        public String getGesture() {
            return this.gesture;
        }

        public ActiveInteractionEuCreateResponseBodyData setPerson(String person) {
            this.person = person;
            return this;
        }
        public String getPerson() {
            return this.person;
        }

        public ActiveInteractionEuCreateResponseBodyData setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

}
