// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListUserDrawRecordByPkRequest extends TeaModel {
    @NameInMap("aliyunPk")
    public String aliyunPk;

    @NameInMap("drawGroup")
    public String drawGroup;

    @NameInMap("drawPoolName")
    public String drawPoolName;

    public static ListUserDrawRecordByPkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserDrawRecordByPkRequest self = new ListUserDrawRecordByPkRequest();
        return TeaModel.build(map, self);
    }

    public ListUserDrawRecordByPkRequest setAliyunPk(String aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public String getAliyunPk() {
        return this.aliyunPk;
    }

    public ListUserDrawRecordByPkRequest setDrawGroup(String drawGroup) {
        this.drawGroup = drawGroup;
        return this;
    }
    public String getDrawGroup() {
        return this.drawGroup;
    }

    public ListUserDrawRecordByPkRequest setDrawPoolName(String drawPoolName) {
        this.drawPoolName = drawPoolName;
        return this;
    }
    public String getDrawPoolName() {
        return this.drawPoolName;
    }

}
