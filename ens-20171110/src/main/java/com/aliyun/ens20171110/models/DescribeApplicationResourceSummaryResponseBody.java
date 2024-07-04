// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeApplicationResourceSummaryResponseBody extends TeaModel {
    /**
     * <p>The statistical information about the resource quota and usage in different regions.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;Level&quot;:&quot;RegionId&quot;,
     *     &quot;Summary&quot;:[
     *         {
     *             &quot;InstanceType&quot;:&quot;ens.a6e.large&quot;,
     *             &quot;SystemDiskMaxSize&quot;:20480,
     *             &quot;DataDiskMaxSize&quot;:0,
     *             &quot;BandwidthOutLimit&quot;:100,
     *             &quot;InstanceTotalMaxCount&quot;:0,
     *             &quot;InstanceTotalCount&quot;:4,
     *             &quot;InstanceCountStat&quot;:[
     *                 {
     *                     &quot;AreaCode&quot;:&quot;330100&quot;,
     *                     &quot;AreaName&quot;:&quot;&quot;,
     *                     &quot;IspCode&quot;:&quot;cmcc&quot;,
     *                     &quot;RegionIds&quot;:[
     *                         &quot;cn-hangzhou-cmcc-7&quot;
     *                     ],
     *                     &quot;InstanceMaxCount&quot;:0,
     *                     &quot;InstanceCount&quot;:4
     *                 }
     *             ]
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("ApplicationResource")
    public String applicationResource;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>50373E71-7710-4620-8AAB-133CCE49451C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApplicationResourceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationResourceSummaryResponseBody self = new DescribeApplicationResourceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationResourceSummaryResponseBody setApplicationResource(String applicationResource) {
        this.applicationResource = applicationResource;
        return this;
    }
    public String getApplicationResource() {
        return this.applicationResource;
    }

    public DescribeApplicationResourceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
