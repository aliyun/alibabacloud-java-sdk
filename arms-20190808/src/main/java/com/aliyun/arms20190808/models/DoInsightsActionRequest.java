// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DoInsightsActionRequest extends TeaModel {
    /**
     * <p>Query parameters. The query parameters vary depending on the module type.</p>
     * <ul>
     * <li>QueryTopo</li>
     * </ul>
     * <pre><code>{
     *     &quot;regionId&quot;: string,  #Region ID
     *     &quot;startTime&quot;: string, #Start time in the format of yyyy-MM-dd HH:mm:ss
     *     &quot;endTime&quot;: string, #End time in the format of yyyy-MM-dd HH:mm:ss
     *     &quot;edgeFilter&quot;: { #Edge filter conditions
     *         &quot;includeTypes&quot;: [enum], #Edge types to include
     *         &quot;excludeTypes&quot;: [enum], #Edge types to exclude
     *         &quot;fromNodeFilter&quot;: { #Source node filter conditions
     *             &quot;includeEntityTypes&quot;: [enum] #Entity types to include
     *             &quot;excludeEntityTypes&quot;: [enum] #Entity types to exclude
     *         },
     *         &quot;toNodeFilter&quot;: {  #Target node filter conditions
     *             &quot;includeEntityTypes&quot;: [enum] #Entity types to include
     *             &quot;excludeEntityTypes&quot;: [enum] #Entity types to exclude
     *         }
     *     },
     *     &quot;includeIsolatedNodes&quot;: boolean, #Whether to include isolated nodes
     *     &quot;isolatedNodeFilter&quot;: { # Isolated node filter conditions
     *         &quot;includeEntityTypes&quot;: [enum] #Entity types to include
     *         &quot;excludeEntityTypes&quot;: [enum] #Entity types to exclude
     *      },
     *     &quot;queryMetrics&quot;: boolean, # Whether to synchronously query related RED metrics when querying topology
     *     &quot;timeoutSecs&quot;: int, # Metrics query timeout in seconds
     *     &quot;redOption&quot;: { #Metrics query control options
     *         &quot;skipRt&quot;: boolean,  # Whether to skip querying RT metrics
     *         &quot;skipCount&quot;: boolean, # Whether to skip querying request count metrics
     *         &quot;skipError&quot;: boolean # Whether to skip querying error count metrics
     *     }
     * }
     * </code></pre>
     * <ul>
     * <li>QueryTopoRed</li>
     * </ul>
     * <pre><code>{
     *     &quot;regionId&quot;: string,  #Region ID
     *     &quot;startTime&quot;: string, #Start time in the format of yyyy-MM-dd HH:mm:ss
     *     &quot;endTime&quot;: string,   #End time in the format of yyyy-MM-dd HH:mm:ss
     *     &quot;edgeIds&quot;: [string]  #Edge IDs to query
     *     &quot;nodeIds&quot;: [string]  #Node IDs to query
     *     &quot;redOption&quot;: { #Metrics query control options
     *         &quot;skipRt&quot;: boolean,  # Whether to skip querying RT metrics
     *         &quot;skipCount&quot;: boolean, # Whether to skip querying request count metrics
     *         &quot;skipError&quot;: boolean # Whether to skip querying error count metrics
     *     }
     * }
     * </code></pre>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li><p>QueryTopo</p>
     * <p>  {
     *   &quot;regionId&quot;: &quot;cn-hangzhou&quot;,
     *   &quot;startTime&quot;: &quot;2024-07-23 19:16:00&quot;,<br>  &quot;endTime&quot;: &quot;2024-07-23 20:16:00&quot;, # 限定拓扑查询范围为 2024-07-23 19:16:00至2024-07-23 20:16:00
     *   &quot;edgeFilter&quot;: {
     *       &quot;includeTypes&quot;: [
     *           &quot;CALLS&quot; # 限定结果拓扑中仅包含调用关系的边
     *       ],
     *       &quot;fromNodeFilter&quot;: {
     *           &quot;includeEntityTypes&quot;: [ # 限定调用边的源节点类型必须为应用类型
     *               &quot;APPLICATION&quot; 
     *           ]
     *       },
     *       &quot;toNodeFilter&quot;: {
     *           &quot;includeEntityTypes&quot;: [ # 限定调用边的目标节点必须为应用类型或者外部服务类型
     *               &quot;APPLICATION&quot;,
     *               &quot;EXTERNAL_SERVICE&quot;
     *           ]
     *       }
     *   },
     *   &quot;includeIsolatedNodes&quot;: false, # 结果拓扑中不包含孤立节点
     *   &quot;queryMetrics&quot;: true, # 同步查询RED指标
     *   &quot;timeoutSecs&quot;: 20, #最多用20秒来查询指标数据
     *   &quot;redOption&quot;: { # 查询的指标包括耗时、请求量，跳过错误数的查询
     *       &quot;skipRt&quot;: false,
     *       &quot;skipCount&quot;: false,
     *       &quot;skipError&quot;: true
     *   }
     *   }</p>
     * </li>
     * <li><p>QueryTopoRed</p>
     * <p>  {
     *   &quot;regionId&quot;: &quot;cn-hangzhou&quot;,
     *   &quot;startTime&quot;: &quot;2024-07-23 10:00:00&quot;,
     *   &quot;endTime&quot;: &quot;2024-07-23 14:00:00&quot;,
     *   &quot;edgeIds&quot;: [
     *       &quot;097843bd50b06fbe2c6c1d8b761a7e8b&quot;
     *   ],
     *   &quot;nodeIds&quot;: [
     *       &quot;23d973261c6923da1b5b7a571ec1aa8b&quot;
     *   ],
     *   &quot;redOption&quot;: { # 查询的指标包括耗时、请求量，跳过错误数的查询
     *       &quot;skipCount&quot;: false,
     *       &quot;skipError&quot;: true,
     *       &quot;skipRt&quot;: false
     *   }
     *   }</p>
     * </li>
     * </ul>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Module type</p>
     * <ul>
     * <li><p>QueryTopo </p>
     * <p>  Topology query feature. A topology consists of edges and nodes. Each edge has a corresponding type, each node has a corresponding entity, and each entity has its type. By setting the edge type, node type, query time range, and other filter parameters, you can filter out the required topology data.</p>
     * </li>
     * <li><p>QueryTopoRed</p>
     * <p>  Topology RED metrics (request count, latency, error count) query. When querying a topology with the metrics query option enabled, the topology may be too large to retrieve all metrics data. This feature allows users to actively query metrics data for specified nodes and edges.</p>
     * </li>
     * </ul>
     * <p>Note: The above features are in canary release and are not enabled by default. To enable them, please contact ARMS on-call support.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QueryTopo</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DoInsightsActionRequest build(java.util.Map<String, ?> map) throws Exception {
        DoInsightsActionRequest self = new DoInsightsActionRequest();
        return TeaModel.build(map, self);
    }

    public DoInsightsActionRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DoInsightsActionRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DoInsightsActionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
