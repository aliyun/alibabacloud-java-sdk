// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class SelectedDomainListResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Module")
    public SelectedDomainListResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SelectedDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SelectedDomainListResponseBody self = new SelectedDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public SelectedDomainListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SelectedDomainListResponseBody setModule(SelectedDomainListResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public SelectedDomainListResponseBodyModule getModule() {
        return this.module;
    }

    public SelectedDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SelectedDomainListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SelectedDomainListResponseBodyModule extends TeaModel {
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        public static SelectedDomainListResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            SelectedDomainListResponseBodyModule self = new SelectedDomainListResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public SelectedDomainListResponseBodyModule setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

    }

}
