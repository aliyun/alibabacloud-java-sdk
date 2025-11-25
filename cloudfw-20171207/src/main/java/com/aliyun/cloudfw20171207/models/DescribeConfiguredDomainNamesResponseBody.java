// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeConfiguredDomainNamesResponseBody extends TeaModel {
    @NameInMap("DomainNames")
    public java.util.List<DescribeConfiguredDomainNamesResponseBodyDomainNames> domainNames;

    /**
     * <strong>example:</strong>
     * <p>sg_server</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <strong>example:</strong>
     * <p>09A2D6F1-EA1B-56D9-977D-74878405****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeConfiguredDomainNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfiguredDomainNamesResponseBody self = new DescribeConfiguredDomainNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfiguredDomainNamesResponseBody setDomainNames(java.util.List<DescribeConfiguredDomainNamesResponseBodyDomainNames> domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public java.util.List<DescribeConfiguredDomainNamesResponseBodyDomainNames> getDomainNames() {
        return this.domainNames;
    }

    public DescribeConfiguredDomainNamesResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DescribeConfiguredDomainNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfiguredDomainNamesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeConfiguredDomainNamesResponseBodyDomainNames extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsMalicious")
        public Boolean isMalicious;

        /**
         * <strong>example:</strong>
         * <p>1534408189</p>
         */
        @NameInMap("OperationTime")
        public Integer operationTime;

        public static DescribeConfiguredDomainNamesResponseBodyDomainNames build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfiguredDomainNamesResponseBodyDomainNames self = new DescribeConfiguredDomainNamesResponseBodyDomainNames();
            return TeaModel.build(map, self);
        }

        public DescribeConfiguredDomainNamesResponseBodyDomainNames setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeConfiguredDomainNamesResponseBodyDomainNames setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeConfiguredDomainNamesResponseBodyDomainNames setIsMalicious(Boolean isMalicious) {
            this.isMalicious = isMalicious;
            return this;
        }
        public Boolean getIsMalicious() {
            return this.isMalicious;
        }

        public DescribeConfiguredDomainNamesResponseBodyDomainNames setOperationTime(Integer operationTime) {
            this.operationTime = operationTime;
            return this;
        }
        public Integer getOperationTime() {
            return this.operationTime;
        }

    }

}
