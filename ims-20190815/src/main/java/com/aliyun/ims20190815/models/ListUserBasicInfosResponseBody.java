// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUserBasicInfosResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the response is truncated. Valid value:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The `marker`. If part of a previous response is truncated, you can use this parameter to obtain the truncated part.</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the information about the RAM user.</p>
     */
    @NameInMap("UserBasicInfos")
    public ListUserBasicInfosResponseBodyUserBasicInfos userBasicInfos;

    public static ListUserBasicInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserBasicInfosResponseBody self = new ListUserBasicInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserBasicInfosResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListUserBasicInfosResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUserBasicInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserBasicInfosResponseBody setUserBasicInfos(ListUserBasicInfosResponseBodyUserBasicInfos userBasicInfos) {
        this.userBasicInfos = userBasicInfos;
        return this;
    }
    public ListUserBasicInfosResponseBodyUserBasicInfos getUserBasicInfos() {
        return this.userBasicInfos;
    }

    public static class ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo extends TeaModel {
        /**
         * <p>The display name of the RAM user.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the RAM user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The logon name of the RAM user.</p>
         */
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo self = new ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo();
            return TeaModel.build(map, self);
        }

        public ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

    public static class ListUserBasicInfosResponseBodyUserBasicInfos extends TeaModel {
        @NameInMap("UserBasicInfo")
        public java.util.List<ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo> userBasicInfo;

        public static ListUserBasicInfosResponseBodyUserBasicInfos build(java.util.Map<String, ?> map) throws Exception {
            ListUserBasicInfosResponseBodyUserBasicInfos self = new ListUserBasicInfosResponseBodyUserBasicInfos();
            return TeaModel.build(map, self);
        }

        public ListUserBasicInfosResponseBodyUserBasicInfos setUserBasicInfo(java.util.List<ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo> userBasicInfo) {
            this.userBasicInfo = userBasicInfo;
            return this;
        }
        public java.util.List<ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo> getUserBasicInfo() {
            return this.userBasicInfo;
        }

    }

}
