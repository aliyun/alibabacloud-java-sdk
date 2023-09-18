// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class Render3dAvatarResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Render3dAvatarResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static Render3dAvatarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Render3dAvatarResponseBody self = new Render3dAvatarResponseBody();
        return TeaModel.build(map, self);
    }

    public Render3dAvatarResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Render3dAvatarResponseBody setData(Render3dAvatarResponseBodyData data) {
        this.data = data;
        return this;
    }
    public Render3dAvatarResponseBodyData getData() {
        return this.data;
    }

    public Render3dAvatarResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Render3dAvatarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Render3dAvatarResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Render3dAvatarResponseBodyData extends TeaModel {
        @NameInMap("RenderData")
        public String renderData;

        public static Render3dAvatarResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            Render3dAvatarResponseBodyData self = new Render3dAvatarResponseBodyData();
            return TeaModel.build(map, self);
        }

        public Render3dAvatarResponseBodyData setRenderData(String renderData) {
            this.renderData = renderData;
            return this;
        }
        public String getRenderData() {
            return this.renderData;
        }

    }

}
