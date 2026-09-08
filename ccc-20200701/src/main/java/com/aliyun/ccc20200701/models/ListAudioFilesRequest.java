// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAudioFilesRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The paging ordinal number, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Converting (transforming)<br>
     * Completed (transformation completed)<br>
     * Failed (transformation failed)<br>
     * If this parameter is not specified, resources in all statuses are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Completed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Purpose of the audio file. The default value is General (used in scenarios such as IVR). Other optional values include HoldMusic (hold music during calls).</p>
     * 
     * <strong>example:</strong>
     * <p>General</p>
     */
    @NameInMap("Usage")
    public String usage;

    public static ListAudioFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAudioFilesRequest self = new ListAudioFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListAudioFilesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAudioFilesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAudioFilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAudioFilesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListAudioFilesRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
