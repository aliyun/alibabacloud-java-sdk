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
     * <p>The number of entries per page. If not specified, the server default value is used.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Filters by reference strength. Valid values: STRONG, WEAK.</p>
     * 
     * <strong>example:</strong>
     * <p>STRONG</p>
     */
    @NameInMap("refType")
    public String refType;

    /**
     * <p>Filters by reference selector type. Valid values: LABEL, VERSION.</p>
     * 
     * <strong>example:</strong>
     * <p>LABEL</p>
     */
    @NameInMap("selectorType")
    public String selectorType;

    /**
     * <p>Filters by reference selector value. Valid values: latest, a named label, HEAD, or a specific version.</p>
     * 
     * <strong>example:</strong>
     * <p>HEAD</p>
     */
    @NameInMap("selectorValue")
    public String selectorValue;

    /**
     * <p>Filters by reference source identifier. The value must be agentcore or a configured source.</p>
     * 
     * <strong>example:</strong>
     * <p>agentcore</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

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

    public ListSkillReferencesRequest setRefType(String refType) {
        this.refType = refType;
        return this;
    }
    public String getRefType() {
        return this.refType;
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

    public ListSkillReferencesRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

}
