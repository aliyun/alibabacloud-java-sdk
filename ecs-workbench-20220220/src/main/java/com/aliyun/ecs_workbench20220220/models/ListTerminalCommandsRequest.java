// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220.models;

import com.aliyun.tea.*;

public class ListTerminalCommandsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("TerminalSessionToken")
    public String terminalSessionToken;

    public static ListTerminalCommandsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTerminalCommandsRequest self = new ListTerminalCommandsRequest();
        return TeaModel.build(map, self);
    }

    public ListTerminalCommandsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTerminalCommandsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTerminalCommandsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTerminalCommandsRequest setTerminalSessionToken(String terminalSessionToken) {
        this.terminalSessionToken = terminalSessionToken;
        return this;
    }
    public String getTerminalSessionToken() {
        return this.terminalSessionToken;
    }

}
