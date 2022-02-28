// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CheckUpdateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsAvailable")
    public Boolean isAvailable;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Update")
    public CheckUpdateResponseBodyUpdate update;

    public static CheckUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUpdateResponseBody self = new CheckUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUpdateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckUpdateResponseBody setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }
    public Boolean getIsAvailable() {
        return this.isAvailable;
    }

    public CheckUpdateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckUpdateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckUpdateResponseBody setUpdate(CheckUpdateResponseBodyUpdate update) {
        this.update = update;
        return this;
    }
    public CheckUpdateResponseBodyUpdate getUpdate() {
        return this.update;
    }

    public static class CheckUpdateResponseBodyUpdate extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Checksum")
        public String checksum;

        @NameInMap("Description")
        public String description;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Url")
        public String url;

        public static CheckUpdateResponseBodyUpdate build(java.util.Map<String, ?> map) throws Exception {
            CheckUpdateResponseBodyUpdate self = new CheckUpdateResponseBodyUpdate();
            return TeaModel.build(map, self);
        }

        public CheckUpdateResponseBodyUpdate setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CheckUpdateResponseBodyUpdate setChecksum(String checksum) {
            this.checksum = checksum;
            return this;
        }
        public String getChecksum() {
            return this.checksum;
        }

        public CheckUpdateResponseBodyUpdate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CheckUpdateResponseBodyUpdate setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public CheckUpdateResponseBodyUpdate setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
