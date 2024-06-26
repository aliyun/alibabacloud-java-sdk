// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationMembersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeOrganizationMembersResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeOrganizationMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationMembersResponseBody self = new DescribeOrganizationMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationMembersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeOrganizationMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrganizationMembersResponseBody setResult(java.util.List<DescribeOrganizationMembersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeOrganizationMembersResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeOrganizationMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOrganizationMembersResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>consortium-lianmenyumingyi-hc5d1bwl****</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ConsortiumName")
        public String consortiumName;

        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Id</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("JoinedTime")
        public String joinedTime;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeOrganizationMembersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationMembersResponseBodyResult self = new DescribeOrganizationMembersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationMembersResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeOrganizationMembersResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public DescribeOrganizationMembersResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeOrganizationMembersResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeOrganizationMembersResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeOrganizationMembersResponseBodyResult setJoinedTime(String joinedTime) {
            this.joinedTime = joinedTime;
            return this;
        }
        public String getJoinedTime() {
            return this.joinedTime;
        }

        public DescribeOrganizationMembersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOrganizationMembersResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
