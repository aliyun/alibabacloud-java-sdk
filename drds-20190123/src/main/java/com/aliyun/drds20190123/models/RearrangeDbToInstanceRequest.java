// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RearrangeDbToInstanceRequest extends TeaModel {
    @NameInMap("ChooseRds")
    public String chooseRds;

    @NameInMap("ChooseSubDb")
    public String chooseSubDb;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("InstanceList")
    public java.util.List<String> instanceList;

    @NameInMap("OrderId")
    public String orderId;

    public static RearrangeDbToInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RearrangeDbToInstanceRequest self = new RearrangeDbToInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RearrangeDbToInstanceRequest setChooseRds(String chooseRds) {
        this.chooseRds = chooseRds;
        return this;
    }
    public String getChooseRds() {
        return this.chooseRds;
    }

    public RearrangeDbToInstanceRequest setChooseSubDb(String chooseSubDb) {
        this.chooseSubDb = chooseSubDb;
        return this;
    }
    public String getChooseSubDb() {
        return this.chooseSubDb;
    }

    public RearrangeDbToInstanceRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public RearrangeDbToInstanceRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public RearrangeDbToInstanceRequest setInstanceList(java.util.List<String> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<String> getInstanceList() {
        return this.instanceList;
    }

    public RearrangeDbToInstanceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
