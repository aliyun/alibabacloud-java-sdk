// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryPhoneBusinessProfileResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code returned.</p>
     * <br>
     * <p>*   A value of OK indicates that the call is successful.</p>
     * <p>*   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryPhoneBusinessProfileResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryPhoneBusinessProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneBusinessProfileResponseBody self = new QueryPhoneBusinessProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPhoneBusinessProfileResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryPhoneBusinessProfileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPhoneBusinessProfileResponseBody setData(QueryPhoneBusinessProfileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPhoneBusinessProfileResponseBodyData getData() {
        return this.data;
    }

    public QueryPhoneBusinessProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPhoneBusinessProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryPhoneBusinessProfileResponseBodyData extends TeaModel {
        /**
         * <p>The address.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The email address.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The URL of the profile picture.</p>
         */
        @NameInMap("ProfilePictureUrl")
        public String profilePictureUrl;

        /**
         * <p>The industry.</p>
         */
        @NameInMap("Vertical")
        public String vertical;

        /**
         * <p>The websites.</p>
         */
        @NameInMap("Websites")
        public java.util.List<String> websites;

        public static QueryPhoneBusinessProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPhoneBusinessProfileResponseBodyData self = new QueryPhoneBusinessProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPhoneBusinessProfileResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryPhoneBusinessProfileResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryPhoneBusinessProfileResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryPhoneBusinessProfileResponseBodyData setProfilePictureUrl(String profilePictureUrl) {
            this.profilePictureUrl = profilePictureUrl;
            return this;
        }
        public String getProfilePictureUrl() {
            return this.profilePictureUrl;
        }

        public QueryPhoneBusinessProfileResponseBodyData setVertical(String vertical) {
            this.vertical = vertical;
            return this;
        }
        public String getVertical() {
            return this.vertical;
        }

        public QueryPhoneBusinessProfileResponseBodyData setWebsites(java.util.List<String> websites) {
            this.websites = websites;
            return this;
        }
        public java.util.List<String> getWebsites() {
            return this.websites;
        }

    }

}
