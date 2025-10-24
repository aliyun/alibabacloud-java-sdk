// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class ActiveInteractionCreateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ActiveInteractionCreateResponseBodyData data;

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
     * <p>AF54F772-60FF-56FD-A3EA-11620EF1229A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ActiveInteractionCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActiveInteractionCreateResponseBody self = new ActiveInteractionCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public ActiveInteractionCreateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ActiveInteractionCreateResponseBody setData(ActiveInteractionCreateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ActiveInteractionCreateResponseBodyData getData() {
        return this.data;
    }

    public ActiveInteractionCreateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ActiveInteractionCreateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ActiveInteractionCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActiveInteractionCreateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ActiveInteractionCreateResponseBodyData extends TeaModel {
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

        public static ActiveInteractionCreateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ActiveInteractionCreateResponseBodyData self = new ActiveInteractionCreateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ActiveInteractionCreateResponseBodyData setGesture(String gesture) {
            this.gesture = gesture;
            return this;
        }
        public String getGesture() {
            return this.gesture;
        }

        public ActiveInteractionCreateResponseBodyData setPerson(String person) {
            this.person = person;
            return this;
        }
        public String getPerson() {
            return this.person;
        }

        public ActiveInteractionCreateResponseBodyData setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

}
