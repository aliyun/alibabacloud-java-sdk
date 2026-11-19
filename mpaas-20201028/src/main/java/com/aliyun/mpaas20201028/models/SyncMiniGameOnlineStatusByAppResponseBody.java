// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SyncMiniGameOnlineStatusByAppResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Content")
    public SyncMiniGameOnlineStatusByAppResponseBodyContent content;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMsg")
    public String resultMsg;

    @NameInMap("Success")
    public Boolean success;

    public static SyncMiniGameOnlineStatusByAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncMiniGameOnlineStatusByAppResponseBody self = new SyncMiniGameOnlineStatusByAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncMiniGameOnlineStatusByAppResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public SyncMiniGameOnlineStatusByAppResponseBody setContent(SyncMiniGameOnlineStatusByAppResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public SyncMiniGameOnlineStatusByAppResponseBodyContent getContent() {
        return this.content;
    }

    public SyncMiniGameOnlineStatusByAppResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SyncMiniGameOnlineStatusByAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncMiniGameOnlineStatusByAppResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncMiniGameOnlineStatusByAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SyncMiniGameOnlineStatusByAppResponseBodyContent extends TeaModel {
        @NameInMap("CurrentOnlineStatus")
        public Integer currentOnlineStatus;

        @NameInMap("MiniProgramCode")
        public String miniProgramCode;

        @NameInMap("StatusChanged")
        public Boolean statusChanged;

        public static SyncMiniGameOnlineStatusByAppResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            SyncMiniGameOnlineStatusByAppResponseBodyContent self = new SyncMiniGameOnlineStatusByAppResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public SyncMiniGameOnlineStatusByAppResponseBodyContent setCurrentOnlineStatus(Integer currentOnlineStatus) {
            this.currentOnlineStatus = currentOnlineStatus;
            return this;
        }
        public Integer getCurrentOnlineStatus() {
            return this.currentOnlineStatus;
        }

        public SyncMiniGameOnlineStatusByAppResponseBodyContent setMiniProgramCode(String miniProgramCode) {
            this.miniProgramCode = miniProgramCode;
            return this;
        }
        public String getMiniProgramCode() {
            return this.miniProgramCode;
        }

        public SyncMiniGameOnlineStatusByAppResponseBodyContent setStatusChanged(Boolean statusChanged) {
            this.statusChanged = statusChanged;
            return this;
        }
        public Boolean getStatusChanged() {
            return this.statusChanged;
        }

    }

}
