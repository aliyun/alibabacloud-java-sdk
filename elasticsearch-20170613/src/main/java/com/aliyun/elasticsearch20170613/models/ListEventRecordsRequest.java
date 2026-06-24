// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListEventRecordsRequest extends TeaModel {
    /**
     * <p>Start time for event query.</p>
     * 
     * <strong>example:</strong>
     * <p>1746516590000</p>
     */
    @NameInMap("beginTime")
    public String beginTime;

    /**
     * <p>End time for event query.</p>
     * 
     * <strong>example:</strong>
     * <p>1746775790000</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>Page number for paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>Number of entries per page for paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>Object content used for filtering. This parameter is optional. If empty, event records for all instances are returned. Note: The value passed must correspond to the selected filter type.</p>
     * 
     * <strong>example:</strong>
     * <p>**</p>
     */
    @NameInMap("termContent")
    public String termContent;

    /**
     * <p>Object type used for filtering. This parameter is optional. If empty, event records of all types are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("termType")
    public String termType;

    public static ListEventRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventRecordsRequest self = new ListEventRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListEventRecordsRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public ListEventRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListEventRecordsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListEventRecordsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListEventRecordsRequest setTermContent(String termContent) {
        this.termContent = termContent;
        return this;
    }
    public String getTermContent() {
        return this.termContent;
    }

    public ListEventRecordsRequest setTermType(String termType) {
        this.termType = termType;
        return this;
    }
    public String getTermType() {
        return this.termType;
    }

}
