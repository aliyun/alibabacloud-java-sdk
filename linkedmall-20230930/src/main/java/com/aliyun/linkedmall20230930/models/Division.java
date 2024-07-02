// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class Division extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>310000</p>
     */
    @NameInMap("divisionCode")
    public Long divisionCode;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("divisionLevel")
    public Long divisionLevel;

    /**
     * <strong>example:</strong>
     * <p>上海</p>
     */
    @NameInMap("divisionName")
    public String divisionName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("parentId")
    public Long parentId;

    /**
     * <strong>example:</strong>
     * <p>shang hai</p>
     */
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
