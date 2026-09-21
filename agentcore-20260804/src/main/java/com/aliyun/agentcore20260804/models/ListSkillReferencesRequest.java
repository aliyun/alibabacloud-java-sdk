// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListSkillReferencesRequest extends TeaModel {
    /**
     * <p>The page number, starting from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. If this parameter is not specified, the server-side default value is used.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Filters results by reference selector type. Valid values: LABEL and VERSION.</p>
     * 
     * <strong>example:</strong>
     * <p>LABEL</p>
     */
    @NameInMap("selectorType")
    public String selectorType;

    /**
     * <p>Filters results by reference selector value, such as latest, a named label, HEAD, or a specific version.</p>
     * 
     * <strong>example:</strong>
     * <p>HEAD</p>
     */
    @NameInMap("selectorValue")
    public String selectorValue;

    public static ListSkillReferencesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillReferencesRequest self = new ListSkillReferencesRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillReferencesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListSkillReferencesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSkillReferencesRequest setSelectorType(String selectorType) {
        this.selectorType = selectorType;
        return this;
    }
    public String getSelectorType() {
        return this.selectorType;
    }

    public ListSkillReferencesRequest setSelectorValue(String selectorValue) {
        this.selectorValue = selectorValue;
        return this;
    }
    public String getSelectorValue() {
        return this.selectorValue;
    }

}
