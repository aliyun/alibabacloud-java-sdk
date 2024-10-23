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
     * 
     * <strong>example:</strong>
     * <p>19DDD9F7-AFCC-4D72-8CBA-CCE5A142E7AB</p>
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
         * 
         * <strong>example:</strong>
         * <p>LTAI4G3HaMmeHpay2gcq****</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The AccessKey secret provided to you by Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>Y3MSLE6OgizS4qrz5LVFDoyZEL****</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <p>The time when the AccessKey pair was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-15T08:08:54Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The status of the AccessKey pair. Valid values:</p>
         * <ul>
         * <li>Active</li>
         * <li>Inactive</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
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
