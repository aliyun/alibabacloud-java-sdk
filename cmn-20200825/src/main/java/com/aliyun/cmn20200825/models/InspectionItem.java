// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class InspectionItem extends TeaModel {
    // 巡检定时表达式
    @NameInMap("InspectionCrontab")
    public String inspectionCrontab;

    // 巡检项描述
    @NameInMap("ItemDescription")
    public String itemDescription;

    // 巡检项ID
    @NameInMap("ItemId")
    public String itemId;

    // 巡检项名字
    @NameInMap("ItemName")
    public String itemName;

    public static InspectionItem build(java.util.Map<String, ?> map) throws Exception {
        InspectionItem self = new InspectionItem();
        return TeaModel.build(map, self);
    }

    public InspectionItem setInspectionCrontab(String inspectionCrontab) {
        this.inspectionCrontab = inspectionCrontab;
        return this;
    }
    public String getInspectionCrontab() {
        return this.inspectionCrontab;
    }

    public InspectionItem setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
        return this;
    }
    public String getItemDescription() {
        return this.itemDescription;
    }

    public InspectionItem setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public InspectionItem setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

}
