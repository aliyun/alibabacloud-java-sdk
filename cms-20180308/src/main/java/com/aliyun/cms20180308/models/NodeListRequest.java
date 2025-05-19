// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class NodeListRequest extends TeaModel {
    @NameInMap("HostName")
    public String hostName;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SerialNumbers")
    public String serialNumbers;

    @NameInMap("Status")
    public String status;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static NodeListRequest build(java.util.Map<String, ?> map) throws Exception {
        NodeListRequest self = new NodeListRequest();
        return TeaModel.build(map, self);
    }

    public NodeListRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public NodeListRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public NodeListRequest setInstanceRegionId(String instanceRegionId) {
        this.instanceRegionId = instanceRegionId;
        return this;
    }
    public String getInstanceRegionId() {
        return this.instanceRegionId;
    }

    public NodeListRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public NodeListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public NodeListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public NodeListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public NodeListRequest setSerialNumbers(String serialNumbers) {
        this.serialNumbers = serialNumbers;
        return this;
    }
    public String getSerialNumbers() {
        return this.serialNumbers;
    }

    public NodeListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public NodeListRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
