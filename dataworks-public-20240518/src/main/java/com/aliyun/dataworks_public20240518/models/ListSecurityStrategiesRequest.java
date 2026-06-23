// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSecurityStrategiesRequest extends TeaModel {
    /**
     * <p><strong>The control module.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>DataQuery</p>
     */
    @NameInMap("ControlModule")
    public String controlModule;

    /**
     * <p><strong>The control submodule.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>MyCatalog</p>
     */
    @NameInMap("ControlSubModule")
    public String controlSubModule;

    /**
     * <p>The page number. Starts from 1. Default: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListSecurityStrategiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityStrategiesRequest self = new ListSecurityStrategiesRequest();
        return TeaModel.build(map, self);
    }

    public ListSecurityStrategiesRequest setControlModule(String controlModule) {
        this.controlModule = controlModule;
        return this;
    }
    public String getControlModule() {
        return this.controlModule;
    }

    public ListSecurityStrategiesRequest setControlSubModule(String controlSubModule) {
        this.controlSubModule = controlSubModule;
        return this;
    }
    public String getControlSubModule() {
        return this.controlSubModule;
    }

    public ListSecurityStrategiesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSecurityStrategiesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
