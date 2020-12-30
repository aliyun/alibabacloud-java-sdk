// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeOpEntitiesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("OpEntities")
    public java.util.List<DescribeOpEntitiesResponseBodyOpEntities> opEntities;

    public static DescribeOpEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpEntitiesResponseBody self = new DescribeOpEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOpEntitiesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeOpEntitiesResponseBody setOpEntities(java.util.List<DescribeOpEntitiesResponseBodyOpEntities> opEntities) {
        this.opEntities = opEntities;
        return this;
    }
    public java.util.List<DescribeOpEntitiesResponseBodyOpEntities> getOpEntities() {
        return this.opEntities;
    }

    public static class DescribeOpEntitiesResponseBodyOpEntities extends TeaModel {
        @NameInMap("EntityType")
        public Integer entityType;

        @NameInMap("EntityObject")
        public String entityObject;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("OpAction")
        public Integer opAction;

        @NameInMap("OpAccount")
        public String opAccount;

        @NameInMap("OpDesc")
        public String opDesc;

        public static DescribeOpEntitiesResponseBodyOpEntities build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpEntitiesResponseBodyOpEntities self = new DescribeOpEntitiesResponseBodyOpEntities();
            return TeaModel.build(map, self);
        }

        public DescribeOpEntitiesResponseBodyOpEntities setEntityType(Integer entityType) {
            this.entityType = entityType;
            return this;
        }
        public Integer getEntityType() {
            return this.entityType;
        }

        public DescribeOpEntitiesResponseBodyOpEntities setEntityObject(String entityObject) {
            this.entityObject = entityObject;
            return this;
        }
        public String getEntityObject() {
            return this.entityObject;
        }

        public DescribeOpEntitiesResponseBodyOpEntities setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeOpEntitiesResponseBodyOpEntities setOpAction(Integer opAction) {
            this.opAction = opAction;
            return this;
        }
        public Integer getOpAction() {
            return this.opAction;
        }

        public DescribeOpEntitiesResponseBodyOpEntities setOpAccount(String opAccount) {
            this.opAccount = opAccount;
            return this;
        }
        public String getOpAccount() {
            return this.opAccount;
        }

        public DescribeOpEntitiesResponseBodyOpEntities setOpDesc(String opDesc) {
            this.opDesc = opDesc;
            return this;
        }
        public String getOpDesc() {
            return this.opDesc;
        }

    }

}
