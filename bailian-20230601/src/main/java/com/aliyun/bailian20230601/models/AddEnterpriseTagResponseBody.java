// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class AddEnterpriseTagResponseBody extends TeaModel {
    @NameInMap("Data")
    public AddEnterpriseTagResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddEnterpriseTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddEnterpriseTagResponseBody self = new AddEnterpriseTagResponseBody();
        return TeaModel.build(map, self);
    }

    public AddEnterpriseTagResponseBody setData(AddEnterpriseTagResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddEnterpriseTagResponseBodyData getData() {
        return this.data;
    }

    public AddEnterpriseTagResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddEnterpriseTagResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public AddEnterpriseTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddEnterpriseTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddEnterpriseTagResponseBodyData extends TeaModel {
        @NameInMap("TagId")
        public Long tagId;

        @NameInMap("TagName")
        public String tagName;

        public static AddEnterpriseTagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddEnterpriseTagResponseBodyData self = new AddEnterpriseTagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddEnterpriseTagResponseBodyData setTagId(Long tagId) {
            this.tagId = tagId;
            return this;
        }
        public Long getTagId() {
            return this.tagId;
        }

        public AddEnterpriseTagResponseBodyData setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
