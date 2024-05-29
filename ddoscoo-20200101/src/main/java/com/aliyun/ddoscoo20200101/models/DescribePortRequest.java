// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortRequest extends TeaModel {
    /**
     * <p>The forwarding port to query. Valid values: **0** to **65535**.</p>
     */
    @NameInMap("FrontendPort")
    public Integer frontendPort;

    /**
     * <p>The type of the forwarding protocol to query. Valid values:</p>
     * <br>
     * <p>*   **tcp**</p>
     * <p>*   **udp**</p>
     */
    @NameInMap("FrontendProtocol")
    public String frontendProtocol;

    /**
     * <p>The ID of the instance to query.</p>
     * <br>
     * <p>> You can call the [DescribeInstanceIds](https://help.aliyun.com/document_detail/157459.html) operation to query the IDs of all instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return. For example, if you want to obtain results on the first page, set the value to **1**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribePortRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePortRequest self = new DescribePortRequest();
        return TeaModel.build(map, self);
    }

    public DescribePortRequest setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    public DescribePortRequest setFrontendProtocol(String frontendProtocol) {
        this.frontendProtocol = frontendProtocol;
        return this;
    }
    public String getFrontendProtocol() {
        return this.frontendProtocol;
    }

    public DescribePortRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribePortRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePortRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
