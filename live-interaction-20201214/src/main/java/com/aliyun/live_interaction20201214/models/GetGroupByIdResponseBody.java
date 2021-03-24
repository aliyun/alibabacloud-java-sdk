// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetGroupByIdResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 错误码
    @NameInMap("Code")
    public String code;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // 群信息获取的返回结果
    @NameInMap("Result")
    public GetGroupByIdResponseBodyResult result;

    public static GetGroupByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGroupByIdResponseBody self = new GetGroupByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGroupByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public GetGroupByIdResponseBody setResult(GetGroupByIdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetGroupByIdResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetGroupByIdResponseBodyResult extends TeaModel {
        // 群会话ID
        @NameInMap("AppCid")
        public String appCid;

        // 群主ID
        @NameInMap("OwnerAppUid")
        public String ownerAppUid;

        // 群图像
        @NameInMap("IconMediaId")
        public String iconMediaId;

        // 群名称
        @NameInMap("Title")
        public String title;

        // 当前群人数
        @NameInMap("MemberCount")
        public Integer memberCount;

        // 群人数上限
        @NameInMap("MemberLimit")
        public Integer memberLimit;

        // 群扩展信息
        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        // 群创建时间
        @NameInMap("CeateTime")
        public Long ceateTime;

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

        public GetGroupByIdResponseBodyResult setOwnerAppUid(String ownerAppUid) {
            this.ownerAppUid = ownerAppUid;
            return this;
        }
        public String getOwnerAppUid() {
            return this.ownerAppUid;
        }

        public GetGroupByIdResponseBodyResult setIconMediaId(String iconMediaId) {
            this.iconMediaId = iconMediaId;
            return this;
        }
        public String getIconMediaId() {
            return this.iconMediaId;
        }

        public GetGroupByIdResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
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

        public GetGroupByIdResponseBodyResult setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

        public GetGroupByIdResponseBodyResult setCeateTime(Long ceateTime) {
            this.ceateTime = ceateTime;
            return this;
        }
        public Long getCeateTime() {
            return this.ceateTime;
        }

    }

}
