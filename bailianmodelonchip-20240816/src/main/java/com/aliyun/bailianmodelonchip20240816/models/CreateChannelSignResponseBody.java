// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class CreateChannelSignResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateChannelSignResponseBodyData data;

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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>65857D96-A86B-5BBB-8392-0793E95DEB81</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public String success;

    public static CreateChannelSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChannelSignResponseBody self = new CreateChannelSignResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChannelSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateChannelSignResponseBody setData(CreateChannelSignResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateChannelSignResponseBodyData getData() {
        return this.data;
    }

    public CreateChannelSignResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateChannelSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateChannelSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateChannelSignResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateChannelSignResponseBodyData extends TeaModel {
        @NameInMap("channelName")
        public String channelName;

        @NameInMap("contact")
        public String contact;

        /**
         * <strong>example:</strong>
         * <p>2024-11-25 08:00:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2024-11-25 08:00:00</p>
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
         * <p>review</p>
         */
        @NameInMap("status")
        public String status;

        public static CreateChannelSignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateChannelSignResponseBodyData self = new CreateChannelSignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateChannelSignResponseBodyData setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public CreateChannelSignResponseBodyData setContact(String contact) {
            this.contact = contact;
            return this;
        }
        public String getContact() {
            return this.contact;
        }

        public CreateChannelSignResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateChannelSignResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateChannelSignResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public CreateChannelSignResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public CreateChannelSignResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreateChannelSignResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
