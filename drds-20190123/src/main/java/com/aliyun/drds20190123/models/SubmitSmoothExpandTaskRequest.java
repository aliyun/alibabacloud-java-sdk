// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSmoothExpandTaskRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DbInstanceIsCreating")
    public Boolean dbInstanceIsCreating;

    @NameInMap("TransferTaskInfos")
    public java.util.List<SubmitSmoothExpandTaskRequestTransferTaskInfos> transferTaskInfos;

    @NameInMap("RdsSuperInstances")
    public java.util.List<SubmitSmoothExpandTaskRequestRdsSuperInstances> rdsSuperInstances;

    public static SubmitSmoothExpandTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmoothExpandTaskRequest self = new SubmitSmoothExpandTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSmoothExpandTaskRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SubmitSmoothExpandTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SubmitSmoothExpandTaskRequest setDbInstanceIsCreating(Boolean dbInstanceIsCreating) {
        this.dbInstanceIsCreating = dbInstanceIsCreating;
        return this;
    }
    public Boolean getDbInstanceIsCreating() {
        return this.dbInstanceIsCreating;
    }

    public SubmitSmoothExpandTaskRequest setTransferTaskInfos(java.util.List<SubmitSmoothExpandTaskRequestTransferTaskInfos> transferTaskInfos) {
        this.transferTaskInfos = transferTaskInfos;
        return this;
    }
    public java.util.List<SubmitSmoothExpandTaskRequestTransferTaskInfos> getTransferTaskInfos() {
        return this.transferTaskInfos;
    }

    public SubmitSmoothExpandTaskRequest setRdsSuperInstances(java.util.List<SubmitSmoothExpandTaskRequestRdsSuperInstances> rdsSuperInstances) {
        this.rdsSuperInstances = rdsSuperInstances;
        return this;
    }
    public java.util.List<SubmitSmoothExpandTaskRequestRdsSuperInstances> getRdsSuperInstances() {
        return this.rdsSuperInstances;
    }

    public static class SubmitSmoothExpandTaskRequestTransferTaskInfos extends TeaModel {
        @NameInMap("DbName")
        public String dbName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("DstInstanceName")
        public String dstInstanceName;

        @NameInMap("SrcInstanceName")
        public String srcInstanceName;

        public static SubmitSmoothExpandTaskRequestTransferTaskInfos build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmoothExpandTaskRequestTransferTaskInfos self = new SubmitSmoothExpandTaskRequestTransferTaskInfos();
            return TeaModel.build(map, self);
        }

        public SubmitSmoothExpandTaskRequestTransferTaskInfos setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public SubmitSmoothExpandTaskRequestTransferTaskInfos setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public SubmitSmoothExpandTaskRequestTransferTaskInfos setDstInstanceName(String dstInstanceName) {
            this.dstInstanceName = dstInstanceName;
            return this;
        }
        public String getDstInstanceName() {
            return this.dstInstanceName;
        }

        public SubmitSmoothExpandTaskRequestTransferTaskInfos setSrcInstanceName(String srcInstanceName) {
            this.srcInstanceName = srcInstanceName;
            return this;
        }
        public String getSrcInstanceName() {
            return this.srcInstanceName;
        }

    }

    public static class SubmitSmoothExpandTaskRequestRdsSuperInstances extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("RdsName")
        public String rdsName;

        @NameInMap("AccountName")
        public String accountName;

        public static SubmitSmoothExpandTaskRequestRdsSuperInstances build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmoothExpandTaskRequestRdsSuperInstances self = new SubmitSmoothExpandTaskRequestRdsSuperInstances();
            return TeaModel.build(map, self);
        }

        public SubmitSmoothExpandTaskRequestRdsSuperInstances setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public SubmitSmoothExpandTaskRequestRdsSuperInstances setRdsName(String rdsName) {
            this.rdsName = rdsName;
            return this;
        }
        public String getRdsName() {
            return this.rdsName;
        }

        public SubmitSmoothExpandTaskRequestRdsSuperInstances setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

}
