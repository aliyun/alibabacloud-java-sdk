// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class AddTagsBatchRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;dbfs-nUy1tb<strong><strong><strong><strong>BQ4X8Gpw&quot;,&quot;dbfs-v0WvA</strong></strong></strong></strong>tVEVcgJLg&quot;]</p>
     */
    @NameInMap("DbfsList")
    public String dbfsList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;TagKey&quot;:&quot;k1&quot;,&quot;TagValue&quot;:&quot;v1&quot;},{&quot;TagKey&quot;:&quot;k2&quot;,&quot;TagValue&quot;:&quot;v2&quot;}]</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static AddTagsBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTagsBatchRequest self = new AddTagsBatchRequest();
        return TeaModel.build(map, self);
    }

    public AddTagsBatchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddTagsBatchRequest setDbfsList(String dbfsList) {
        this.dbfsList = dbfsList;
        return this;
    }
    public String getDbfsList() {
        return this.dbfsList;
    }

    public AddTagsBatchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddTagsBatchRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
