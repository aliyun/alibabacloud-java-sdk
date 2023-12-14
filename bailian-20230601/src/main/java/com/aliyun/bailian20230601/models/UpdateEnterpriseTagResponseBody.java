// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseTagResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateEnterpriseTagResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateEnterpriseTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseTagResponseBody self = new UpdateEnterpriseTagResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseTagResponseBody setData(UpdateEnterpriseTagResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateEnterpriseTagResponseBodyData getData() {
        return this.data;
    }

    public UpdateEnterpriseTagResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateEnterpriseTagResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateEnterpriseTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEnterpriseTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateEnterpriseTagResponseBodyData extends TeaModel {
        @NameInMap("TagId")
        public Long tagId;

        @NameInMap("TagName")
        public String tagName;

        public static UpdateEnterpriseTagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnterpriseTagResponseBodyData self = new UpdateEnterpriseTagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateEnterpriseTagResponseBodyData setTagId(Long tagId) {
            this.tagId = tagId;
            return this;
        }
        public Long getTagId() {
            return this.tagId;
        }

        public UpdateEnterpriseTagResponseBodyData setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
