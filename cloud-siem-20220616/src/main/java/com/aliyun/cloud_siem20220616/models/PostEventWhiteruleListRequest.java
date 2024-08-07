// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostEventWhiteruleListRequest extends TeaModel {
    /**
     * <p>The UUID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the account that you switch from the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li>0: the current Alibaba Cloud account</li>
     * <li>1: the global account</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The alert whitelist rule. The value is a JSON object.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;alertName&quot;: &quot;webshell&quot;,
     *             &quot;alertNameId&quot;: &quot;webshell&quot;,
     *             &quot;alertType&quot;: &quot;command&quot;,
     *             &quot;alertTypeId&quot;: &quot;command&quot;,
     *             &quot;expression&quot;: {
     *                   &quot;status&quot;: 1,
     *                   &quot;conditions&quot;: [
     *                         {
     *                               &quot;isNot&quot;: false,
     *                               &quot;left&quot;: {
     *                                     &quot;value&quot;: &quot;file_path&quot;
     *                               },
     *                               &quot;operator&quot;: &quot;gt&quot;,
     *                               &quot;right&quot;: {
     *                                     &quot;value&quot;: &quot;cp&quot;
     *                               }
     *                         }
     *                   ]
     *             }
     *       }
     * ]</p>
     */
    @NameInMap("WhiteruleList")
    public String whiteruleList;

    public static PostEventWhiteruleListRequest build(java.util.Map<String, ?> map) throws Exception {
        PostEventWhiteruleListRequest self = new PostEventWhiteruleListRequest();
        return TeaModel.build(map, self);
    }

    public PostEventWhiteruleListRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public PostEventWhiteruleListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PostEventWhiteruleListRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public PostEventWhiteruleListRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public PostEventWhiteruleListRequest setWhiteruleList(String whiteruleList) {
        this.whiteruleList = whiteruleList;
        return this;
    }
    public String getWhiteruleList() {
        return this.whiteruleList;
    }

}
