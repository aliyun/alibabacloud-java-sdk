// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeAIServiceRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>To view details of all instances in a region, including their IDs, call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drama-123456</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The type of service. Only drama is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drama</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeAIServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIServiceRequest self = new DescribeAIServiceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAIServiceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeAIServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DescribeAIServiceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
