// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DoInsightsActionRequest extends TeaModel {
    /**
     * <p>The query parameters. Different module types correspond to different query parameters.</p>
     * <ul>
     * <li>QueryTopo</li>
     * </ul>
     * <!---->
     * 
     * <pre><code>{
     *     &quot;regionId&quot;: string,  # The region ID.
     *     &quot;startTime&quot;: string, #. The start time. Format: yyyy-MM-dd HH:mm:ss.
     *     &quot;endTime&quot;: string, # The end time. Format: yyyy-MM-dd HH:mm:ss.
     *     &quot;edgeFilter&quot;: { # The edge filter condition.
     *         &quot;includeTypes&quot;: [enum], # The edge types to be included.
     *         &quot;excludeTypes&quot;: [enum], # The edge types to be excluded.
     *         &quot;fromNodeFilter&quot;: { # The source node filter condition.
     *             &quot;includeEntityTypes&quot;: [enum] # The entity types to be included.
     *             &quot;excludeEntityTypes&quot;: [enum] #The entity types to be excluded.
     *         },
     *         &quot;toNodeFilter&quot;: {  #The target node filter condition.
     *             &quot;includeEntityTypes&quot;: [enum] # The entity types to be included.
     *             &quot;excludeEntityTypes&quot;: [enum] #The entity types to be excluded.
     *         }
     *     },
     *     &quot;includeIsolatedNodes&quot;: boolean, #Specifies whether to include isolated nodes.
     *     &quot;isolatedNodeFilter&quot;: { # The isolated node filter condition.
     *         &quot;includeEntityTypes&quot;: [enum] # The entity types to be included.
     *         &quot;excludeEntityTypes&quot;: [enum] #The entity types to be excluded.
     *      },
     *     &quot;queryMetrics&quot;: boolean, # Specifies whether to query RED metrics along with metrics.
     *     &quot;timeoutSecs&quot;: int, # The timeout period of metric query.
     *     &quot;redOption&quot;: { # The metric query option.
     *         &quot;skipRt&quot;: boolean,  # Specifies whether to skip querying the response time.
     *         &quot;skipCount&quot;: boolean, # Specifies whether to skip querying the number of requests.
     *         &quot;skipError&quot;: boolean # Specifies whether to skip querying the number of errors.
     *     }
     * }
     * </code></pre>
     * <ul>
     * <li>QueryTopoRed</li>
     * </ul>
     * <!---->
     * 
     * <pre><code>{
     *     &quot;regionId&quot;: string,  # The region ID.
     *     &quot;startTime&quot;: string, #. The start time. Format: yyyy-MM-dd HH:mm:ss.
     *     &quot;endTime&quot;: string,   # The end time. Format: yyyy-MM-dd HH:mm:ss.
     *     &quot;edgeIds&quot;: [string]  # The edge ID to be queried.
     *     &quot;nodeIds&quot;: [string]  # The node ID to be queried.
     *     &quot;redOption&quot;: { # The metric query option.
     *         &quot;skipRt&quot;: boolean,  # Specifies whether to skip querying the response time.
     *         &quot;skipRt&quot;: boolean,  # Specifies whether to skip querying the number of requests.
     *         &quot;skipError&quot;: boolean # Specifies whether to skip querying the number of errors.
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
     *   &quot;startTime&quot;: &quot;2024-07-23 19:16:00&quot;,<br>  &quot;endTime&quot;: &quot;2024-07-23 20:16:00&quot;, # Limit the topology query range to 2024-07-23 19:16:00 to 2024-07-23 20:16:00
     *   &quot;edgeFilter&quot;: {
     *       &quot;includeTypes&quot;: [
     *           &quot;CALLS&quot; # The resulting topology only contains edges of call relationships.
     *       ],
     *       &quot;fromNodeFilter&quot;: {
     *           &quot;includeEntityTypes&quot;: [ # The source node type of the call edge must be application type
     *               &quot;APPLICATION&quot; 
     *           ]
     *       },
     *       &quot;toNodeFilter&quot;: {
     *           &quot;includeEntityTypes&quot;: [ # The target node of the call edge must be an application type or an external service type.
     *               &quot;APPLICATION&quot;,
     *               &quot;EXTERNAL_SERVICE&quot;
     *           ]
     *       }
     *   },
     *   &quot;includeIsolatedNodes&quot;: false, # The resulting topology does not contain isolated nodes
     *   &quot;queryMetrics&quot;: true, # Synchronously query the RED indicator
     *   &quot;timeoutSecs&quot;: 20, #It takes up to 20 seconds to query indicator data
     *   &quot;redOption&quot;: { # The query indicators include time consumption, request volume, and query skip errors.
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
     *   &quot;redOption&quot;: { # The query indicators include time consumption, request volume, and query skip errors.
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
     * <p>The module type.</p>
     * <ul>
     * <li><p>QueryTopo</p>
     * <p>Queries topologies. A topology consists of edges and nodes, where each edge has a corresponding type and each node corresponds to an entity, which also has its type. By setting filter parameters such as the type of edges, the type of nodes, and the query time range, you can filter out the required topology data.</p>
     * </li>
     * <li><p>QueryTopoRed</p>
     * <p>Queries topology RED metrics (number of requests, duration, number of errors). When querying a topology with the metric query option enabled, it might not be possible to retrieve all metric data due to the topology being too large. This module allows users to actively query for metric data of specified nodes and edges.</p>
     * </li>
     * </ul>
     * <p>Note: The aforementioned modules are currently in a canary release phase and are not enabled by default. If you need to enable them, please contact the ARMS on-duty number.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>QueryTopoRed</li>
     * <li>QueryTopo</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QueryTopo</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <p>The region ID.</p>
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
