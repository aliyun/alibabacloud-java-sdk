// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeOpEntitiesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

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

    public DescribeOpEntitiesResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeOpEntitiesResponse setOpEntities(java.util.List<DescribeOpEntitiesResponseOpEntities> opEntities) {
        this.opEntities = opEntities;
        return this;
    }
    public java.util.List<DescribeOpEntitiesResponseOpEntities> getOpEntities() {
        return this.opEntities;
    }

    public static class DescribeOpEntitiesResponseOpEntities extends TeaModel {
        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("EntityType")
        @Validation(required = true)
        public Integer entityType;

        @NameInMap("EntityObject")
        @Validation(required = true)
        public String entityObject;

        @NameInMap("OpAction")
        @Validation(required = true)
        public Integer opAction;

        @NameInMap("OpAccount")
        @Validation(required = true)
        public String opAccount;

        @NameInMap("OpDesc")
        @Validation(required = true)
        public String opDesc;

        public static DescribeOpEntitiesResponseOpEntities build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpEntitiesResponseOpEntities self = new DescribeOpEntitiesResponseOpEntities();
            return TeaModel.build(map, self);
        }

        public DescribeOpEntitiesResponseOpEntities setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeOpEntitiesResponseOpEntities setEntityType(Integer entityType) {
            this.entityType = entityType;
            return this;
        }
        public Integer getEntityType() {
            return this.entityType;
        }

        public DescribeOpEntitiesResponseOpEntities setEntityObject(String entityObject) {
            this.entityObject = entityObject;
            return this;
        }
        public String getEntityObject() {
            return this.entityObject;
        }

        public DescribeOpEntitiesResponseOpEntities setOpAction(Integer opAction) {
            this.opAction = opAction;
            return this;
        }
        public Integer getOpAction() {
            return this.opAction;
        }

        public DescribeOpEntitiesResponseOpEntities setOpAccount(String opAccount) {
            this.opAccount = opAccount;
            return this;
        }
        public String getOpAccount() {
            return this.opAccount;
        }

        public DescribeOpEntitiesResponseOpEntities setOpDesc(String opDesc) {
            this.opDesc = opDesc;
            return this;
        }
        public String getOpDesc() {
            return this.opDesc;
        }

    }

}
