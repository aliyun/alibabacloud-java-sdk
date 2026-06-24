// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListOpenSourceAccountsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListOpenSourceAccountsResponseBodyData> data;

    /**
     * <p>The maximum number of entries to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token that marks the end of the current query. This token is passed as a parameter in the next call to continue pagination. Set this parameter to an empty string for the first call or when the last page is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>021788F6-E50C-4BD6-9F80-66B0A19A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListOpenSourceAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOpenSourceAccountsResponseBody self = new ListOpenSourceAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOpenSourceAccountsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListOpenSourceAccountsResponseBody setData(java.util.List<ListOpenSourceAccountsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOpenSourceAccountsResponseBodyData> getData() {
        return this.data;
    }

    public ListOpenSourceAccountsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOpenSourceAccountsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOpenSourceAccountsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOpenSourceAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOpenSourceAccountsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOpenSourceAccountsResponseBodyData extends TeaModel {
        /**
         * <p>The Alibaba Cloud UID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678900123</p>
         */
        @NameInMap("AliyunUserId")
        public Long aliyunUserId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-abc***</p>
         */
        @NameInMap("CInstanceId")
        public String CInstanceId;

        /**
         * <p>The time when the user was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1704067200000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExtraJson")
        public String extraJson;

        /**
         * <p>The hash algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>bcrypt</p>
         */
        @NameInMap("HashingAlgorithm")
        public String hashingAlgorithm;

        /**
         * <p>The quota configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Limits")
        public String limits;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The password hash.</p>
         * 
         * <strong>example:</strong>
         * <p>f6af6bbb91e947d988d191bfe01c9a9b</p>
         */
        @NameInMap("PasswordHash")
        public String passwordHash;

        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>Indicates whether the password is a weak password. Valid values:</p>
         * <ul>
         * <li>0: No.</li>
         * <li>1: Yes.</li>
         * </ul>
         */
        @NameInMap("WeakPassword")
        public Boolean weakPassword;

        public static ListOpenSourceAccountsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOpenSourceAccountsResponseBodyData self = new ListOpenSourceAccountsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOpenSourceAccountsResponseBodyData setAliyunUserId(Long aliyunUserId) {
            this.aliyunUserId = aliyunUserId;
            return this;
        }
        public Long getAliyunUserId() {
            return this.aliyunUserId;
        }

        public ListOpenSourceAccountsResponseBodyData setCInstanceId(String CInstanceId) {
            this.CInstanceId = CInstanceId;
            return this;
        }
        public String getCInstanceId() {
            return this.CInstanceId;
        }

        public ListOpenSourceAccountsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListOpenSourceAccountsResponseBodyData setExtraJson(String extraJson) {
            this.extraJson = extraJson;
            return this;
        }
        public String getExtraJson() {
            return this.extraJson;
        }

        public ListOpenSourceAccountsResponseBodyData setHashingAlgorithm(String hashingAlgorithm) {
            this.hashingAlgorithm = hashingAlgorithm;
            return this;
        }
        public String getHashingAlgorithm() {
            return this.hashingAlgorithm;
        }

        public ListOpenSourceAccountsResponseBodyData setLimits(String limits) {
            this.limits = limits;
            return this;
        }
        public String getLimits() {
            return this.limits;
        }

        public ListOpenSourceAccountsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOpenSourceAccountsResponseBodyData setPasswordHash(String passwordHash) {
            this.passwordHash = passwordHash;
            return this;
        }
        public String getPasswordHash() {
            return this.passwordHash;
        }

        public ListOpenSourceAccountsResponseBodyData setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListOpenSourceAccountsResponseBodyData setWeakPassword(Boolean weakPassword) {
            this.weakPassword = weakPassword;
            return this;
        }
        public Boolean getWeakPassword() {
            return this.weakPassword;
        }

    }

}
