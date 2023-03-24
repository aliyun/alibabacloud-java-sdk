// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateAccessKeyResponseBody extends TeaModel {
    /**
     * <p>The information of the AccessKey pair.</p>
     */
    @NameInMap("AccessKey")
    public CreateAccessKeyResponseBodyAccessKey accessKey;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccessKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessKeyResponseBody self = new CreateAccessKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessKeyResponseBody setAccessKey(CreateAccessKeyResponseBodyAccessKey accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public CreateAccessKeyResponseBodyAccessKey getAccessKey() {
        return this.accessKey;
    }

    public CreateAccessKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAccessKeyResponseBodyAccessKey extends TeaModel {
        /**
         * <p>The AccessKey ID provided to you by Alibaba Cloud.</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The AccessKey secret provided to you by Alibaba Cloud.</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <p>The time when the AccessKey pair was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The status of the AccessKey pair. Valid values:</p>
         * <br>
         * <p>*   Active</p>
         * <p>*   Inactive</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateAccessKeyResponseBodyAccessKey build(java.util.Map<String, ?> map) throws Exception {
            CreateAccessKeyResponseBodyAccessKey self = new CreateAccessKeyResponseBodyAccessKey();
            return TeaModel.build(map, self);
        }

        public CreateAccessKeyResponseBodyAccessKey setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public CreateAccessKeyResponseBodyAccessKey setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public CreateAccessKeyResponseBodyAccessKey setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateAccessKeyResponseBodyAccessKey setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
