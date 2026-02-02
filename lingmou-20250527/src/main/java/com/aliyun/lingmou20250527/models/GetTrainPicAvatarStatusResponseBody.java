// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class GetTrainPicAvatarStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetTrainPicAvatarStatusResponseBodyData data;

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
     * <strong>example:</strong>
     * <p>7239F9E5-A4DB-55BA-B701-0CE47DBDB0A8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetTrainPicAvatarStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrainPicAvatarStatusResponseBody self = new GetTrainPicAvatarStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrainPicAvatarStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTrainPicAvatarStatusResponseBody setData(GetTrainPicAvatarStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrainPicAvatarStatusResponseBodyData getData() {
        return this.data;
    }

    public GetTrainPicAvatarStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTrainPicAvatarStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTrainPicAvatarStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrainPicAvatarStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTrainPicAvatarStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>M1YJTNTH2yoLmLnzKdYHeGBg</p>
         */
        @NameInMap("avatarId")
        public String avatarId;

        /**
         * <strong>example:</strong>
         * <p>//daily-avatar-property.oss-cn-beijing.aliyuncs.com/avatar-share-property/AVATAR_2D_PIC/Mt.CMTMRYX4TNIU2/retalking_output.mp4?Expires=1764327167&amp;OSSAccessKeyId=LTAI5tBRPnF5JkRCid******&amp;Signature=%2BH%2BSBpNDPiMQtPyl8vraEHMv9X8%3D</p>
         */
        @NameInMap("previewURL")
        public String previewURL;

        @NameInMap("status")
        public String status;

        public static GetTrainPicAvatarStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrainPicAvatarStatusResponseBodyData self = new GetTrainPicAvatarStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrainPicAvatarStatusResponseBodyData setAvatarId(String avatarId) {
            this.avatarId = avatarId;
            return this;
        }
        public String getAvatarId() {
            return this.avatarId;
        }

        public GetTrainPicAvatarStatusResponseBodyData setPreviewURL(String previewURL) {
            this.previewURL = previewURL;
            return this;
        }
        public String getPreviewURL() {
            return this.previewURL;
        }

        public GetTrainPicAvatarStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
