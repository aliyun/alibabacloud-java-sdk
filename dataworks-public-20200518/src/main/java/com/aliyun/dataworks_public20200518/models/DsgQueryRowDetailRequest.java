// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgQueryRowDetailRequest extends TeaModel {
    /**
     * <p>The engine type. Valid values:</p>
     * <ul>
     * <li>ODPS.ODPS</li>
     * <li>EMR</li>
     * <li>HOLO.POSTGRES</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EMR</p>
     */
    @NameInMap("EngineName")
    public String engineName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20260706102936ec393b1a03ae0d4atarget</p>
     */
    @NameInMap("InstId")
    public String instId;

    /**
     * <p>The page number. Minimum value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static DsgQueryRowDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgQueryRowDetailRequest self = new DsgQueryRowDetailRequest();
        return TeaModel.build(map, self);
    }

    public DsgQueryRowDetailRequest setEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }
    public String getEngineName() {
        return this.engineName;
    }

    public DsgQueryRowDetailRequest setInstId(String instId) {
        this.instId = instId;
        return this;
    }
    public String getInstId() {
        return this.instId;
    }

    public DsgQueryRowDetailRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DsgQueryRowDetailRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
