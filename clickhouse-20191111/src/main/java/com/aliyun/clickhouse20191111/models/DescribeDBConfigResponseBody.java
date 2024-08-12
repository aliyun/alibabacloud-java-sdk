// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBConfigResponseBody extends TeaModel {
    /**
     * <p>The configuration information about the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p><dictionaries><dictionary><name>test</name><source><clickhouse><host>10.37.XX.XX</host><port>9000</port><user>default</user><password></password><db>default</db><table>t_organization</table><where>id=1</where><invalidate_query>SQL_QUERY</invalidate_query></clickhouse></source><lifetime><min>31</min><max>33</max></lifetime><layout><flat></flat></layout><structure><key><attribute><name>field1</name><type>String</type></attribute></key></structure></dictionary></dictionaries></p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16060117-92E1-5F3B-BF42-28B172D0F869</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBConfigResponseBody self = new DescribeDBConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeDBConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
