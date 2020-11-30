// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeOpEntitiesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("OpEntities")
    @Validation(required = true)
    public java.util.List<DescribeOpEntitiesResponseOpEntities> opEntities;

    public static DescribeOpEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpEntitiesResponse self = new DescribeOpEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpEntitiesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOpEntitiesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeOpEntitiesResponse setOpEntities(java.util.List<DescribeOpEntitiesResponseOpEntities> opEntities) {
        this.opEntities = opEntities;
        return this;
    }
    public java.util.List<DescribeOpEntitiesResponseOpEntities> getOpEntities() {
        return this.opEntities;
    }

    public static class DescribeOpEntitiesResponseOpEntities extends TeaModel {
        @NameInMap("EntityObject")
        @Validation(required = true)
        public String entityObject;

        @NameInMap("EntityType")
        @Validation(required = true)
        public Integer entityType;

        @NameInMap("OpDesc")
        @Validation(required = true)
        public String opDesc;

        @NameInMap("OpAccount")
        @Validation(required = true)
        public String opAccount;

        @NameInMap("OpAction")
        @Validation(required = true)
        public Integer opAction;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        public static DescribeOpEntitiesResponseOpEntities build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpEntitiesResponseOpEntities self = new DescribeOpEntitiesResponseOpEntities();
            return TeaModel.build(map, self);
        }

        public DescribeOpEntitiesResponseOpEntities setEntityObject(String entityObject) {
            this.entityObject = entityObject;
            return this;
        }
        public String getEntityObject() {
            return this.entityObject;
        }

        public DescribeOpEntitiesResponseOpEntities setEntityType(Integer entityType) {
            this.entityType = entityType;
            return this;
        }
        public Integer getEntityType() {
            return this.entityType;
        }

        public DescribeOpEntitiesResponseOpEntities setOpDesc(String opDesc) {
            this.opDesc = opDesc;
            return this;
        }
        public String getOpDesc() {
            return this.opDesc;
        }

        public DescribeOpEntitiesResponseOpEntities setOpAccount(String opAccount) {
            this.opAccount = opAccount;
            return this;
        }
        public String getOpAccount() {
            return this.opAccount;
        }

        public DescribeOpEntitiesResponseOpEntities setOpAction(Integer opAction) {
            this.opAction = opAction;
            return this;
        }
        public Integer getOpAction() {
            return this.opAction;
        }

        public DescribeOpEntitiesResponseOpEntities setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

    }

}
