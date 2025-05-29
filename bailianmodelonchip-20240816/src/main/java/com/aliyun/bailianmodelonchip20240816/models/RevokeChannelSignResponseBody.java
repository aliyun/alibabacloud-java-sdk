// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class RevokeChannelSignResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public RevokeChannelSignResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2C17015D-F916-5C2B-8C50-424DA829685E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static RevokeChannelSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeChannelSignResponseBody self = new RevokeChannelSignResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeChannelSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RevokeChannelSignResponseBody setData(RevokeChannelSignResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RevokeChannelSignResponseBodyData getData() {
        return this.data;
    }

    public RevokeChannelSignResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RevokeChannelSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RevokeChannelSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RevokeChannelSignResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class RevokeChannelSignResponseBodyData extends TeaModel {
        @NameInMap("channelName")
        public String channelName;

        @NameInMap("contact")
        public String contact;

        /**
         * <strong>example:</strong>
         * <p>2025-05-01 10:43:21</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2025-05-01 10:43:21</p>
         */
        @NameInMap("modifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>13555555555</p>
         */
        @NameInMap("phone")
        public String phone;

        @NameInMap("remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>revoke</p>
         */
        @NameInMap("status")
        public String status;

        public static RevokeChannelSignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RevokeChannelSignResponseBodyData self = new RevokeChannelSignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RevokeChannelSignResponseBodyData setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public RevokeChannelSignResponseBodyData setContact(String contact) {
            this.contact = contact;
            return this;
        }
        public String getContact() {
            return this.contact;
        }

        public RevokeChannelSignResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public RevokeChannelSignResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RevokeChannelSignResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public RevokeChannelSignResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public RevokeChannelSignResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public RevokeChannelSignResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
