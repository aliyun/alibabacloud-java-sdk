// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class Division extends TeaModel {
    @NameInMap("divisionCode")
    public Long divisionCode;

    @NameInMap("divisionLevel")
    public Long divisionLevel;

    @NameInMap("divisionName")
    public String divisionName;

    @NameInMap("parentId")
    public Long parentId;

    @NameInMap("pinyin")
    public String pinyin;

    public static Division build(java.util.Map<String, ?> map) throws Exception {
        Division self = new Division();
        return TeaModel.build(map, self);
    }

    public Division setDivisionCode(Long divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public Long getDivisionCode() {
        return this.divisionCode;
    }

    public Division setDivisionLevel(Long divisionLevel) {
        this.divisionLevel = divisionLevel;
        return this;
    }
    public Long getDivisionLevel() {
        return this.divisionLevel;
    }

    public Division setDivisionName(String divisionName) {
        this.divisionName = divisionName;
        return this;
    }
    public String getDivisionName() {
        return this.divisionName;
    }

    public Division setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public Division setPinyin(String pinyin) {
        this.pinyin = pinyin;
        return this;
    }
    public String getPinyin() {
        return this.pinyin;
    }

}
