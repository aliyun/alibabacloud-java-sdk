// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetGroupByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetGroupByIdResponseBodyResult result;

    public static GetGroupByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGroupByIdResponseBody self = new GetGroupByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGroupByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGroupByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGroupByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGroupByIdResponseBody setResult(GetGroupByIdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetGroupByIdResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetGroupByIdResponseBodyResult extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("CeateTime")
        public Long ceateTime;

        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        @NameInMap("IconMediaId")
        public String iconMediaId;

        @NameInMap("MemberCount")
        public Integer memberCount;

        @NameInMap("MemberLimit")
        public Integer memberLimit;

        @NameInMap("OwnerAppUid")
        public String ownerAppUid;

        @NameInMap("Title")
        public String title;

        public static GetGroupByIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetGroupByIdResponseBodyResult self = new GetGroupByIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetGroupByIdResponseBodyResult setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public GetGroupByIdResponseBodyResult setCeateTime(Long ceateTime) {
            this.ceateTime = ceateTime;
            return this;
        }
        public Long getCeateTime() {
            return this.ceateTime;
        }

        public GetGroupByIdResponseBodyResult setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

        public GetGroupByIdResponseBodyResult setIconMediaId(String iconMediaId) {
            this.iconMediaId = iconMediaId;
            return this;
        }
        public String getIconMediaId() {
            return this.iconMediaId;
        }

        public GetGroupByIdResponseBodyResult setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Integer getMemberCount() {
            return this.memberCount;
        }

        public GetGroupByIdResponseBodyResult setMemberLimit(Integer memberLimit) {
            this.memberLimit = memberLimit;
            return this;
        }
        public Integer getMemberLimit() {
            return this.memberLimit;
        }

        public GetGroupByIdResponseBodyResult setOwnerAppUid(String ownerAppUid) {
            this.ownerAppUid = ownerAppUid;
            return this;
        }
        public String getOwnerAppUid() {
            return this.ownerAppUid;
        }

        public GetGroupByIdResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
