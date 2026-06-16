// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>disabled</p>
     */
    @NameInMap("CrossRegionReplication")
    public String crossRegionReplication;

    /**
     * <p>The edition of the license. Valid values:</p>
     * <ul>
     * <li>free: Free edition.</li>
     * <li>trial: Trial edition.</li>
     * <li>scalability: Scalability edition.</li>
     * <li>standard: Standard edition.</li>
     * <li>enterprise: Enterprise edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>free</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>Instance ID list.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>Page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Instance status. Valid values:</p>
     * <ul>
     * <li>creating: Being created.</li>
     * <li>running: Running.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setCrossRegionReplication(String crossRegionReplication) {
        this.crossRegionReplication = crossRegionReplication;
        return this;
    }
    public String getCrossRegionReplication() {
        return this.crossRegionReplication;
    }

    public ListInstancesRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public ListInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ListInstancesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
