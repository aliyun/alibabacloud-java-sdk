// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUserBasicInfosResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Marker")
    @Validation(required = true)
    public String marker;

    @NameInMap("IsTruncated")
    @Validation(required = true)
    public Boolean isTruncated;

    @NameInMap("UserBasicInfos")
    @Validation(required = true)
    public ListUserBasicInfosResponseUserBasicInfos userBasicInfos;

    public static ListUserBasicInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserBasicInfosResponse self = new ListUserBasicInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListUserBasicInfosResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserBasicInfosResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUserBasicInfosResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListUserBasicInfosResponse setUserBasicInfos(ListUserBasicInfosResponseUserBasicInfos userBasicInfos) {
        this.userBasicInfos = userBasicInfos;
        return this;
    }
    public ListUserBasicInfosResponseUserBasicInfos getUserBasicInfos() {
        return this.userBasicInfos;
    }

    public static class ListUserBasicInfosResponseUserBasicInfosUserBasicInfo extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("UserPrincipalName")
        @Validation(required = true)
        public String userPrincipalName;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        public static ListUserBasicInfosResponseUserBasicInfosUserBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUserBasicInfosResponseUserBasicInfosUserBasicInfo self = new ListUserBasicInfosResponseUserBasicInfosUserBasicInfo();
            return TeaModel.build(map, self);
        }

        public ListUserBasicInfosResponseUserBasicInfosUserBasicInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUserBasicInfosResponseUserBasicInfosUserBasicInfo setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public ListUserBasicInfosResponseUserBasicInfosUserBasicInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

    public static class ListUserBasicInfosResponseUserBasicInfos extends TeaModel {
        @NameInMap("UserBasicInfo")
        @Validation(required = true)
        public java.util.List<ListUserBasicInfosResponseUserBasicInfosUserBasicInfo> userBasicInfo;

        public static ListUserBasicInfosResponseUserBasicInfos build(java.util.Map<String, ?> map) throws Exception {
            ListUserBasicInfosResponseUserBasicInfos self = new ListUserBasicInfosResponseUserBasicInfos();
            return TeaModel.build(map, self);
        }

        public ListUserBasicInfosResponseUserBasicInfos setUserBasicInfo(java.util.List<ListUserBasicInfosResponseUserBasicInfosUserBasicInfo> userBasicInfo) {
            this.userBasicInfo = userBasicInfo;
            return this;
        }
        public java.util.List<ListUserBasicInfosResponseUserBasicInfosUserBasicInfo> getUserBasicInfo() {
            return this.userBasicInfo;
        }

    }

}
