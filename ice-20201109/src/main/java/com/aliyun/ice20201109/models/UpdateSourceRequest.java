// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateSourceRequest extends TeaModel {
    /**
     * <p>The source configurations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{
     *     &quot;sourceGroupName&quot;: &quot;mySourceGroup-1&quot;,
     *     &quot;relativePath&quot;: &quot;group1/hls.m3u8&quot;,
     *     &quot;packageType&quot;: &quot;hls&quot;
     * }]</p>
     */
    @NameInMap("HttpPackageConfigurations")
    public String httpPackageConfigurations;

    /**
     * <p>The name of the source location.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySourcelocation</p>
     */
    @NameInMap("SourceLocationName")
    public String sourceLocationName;

    /**
     * <p>The name of the source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySource</p>
     */
    @NameInMap("SourceName")
    public String sourceName;

    /**
     * <p>The source type. Valid values: vodSource and liveSource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vodSource</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static UpdateSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSourceRequest self = new UpdateSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSourceRequest setHttpPackageConfigurations(String httpPackageConfigurations) {
        this.httpPackageConfigurations = httpPackageConfigurations;
        return this;
    }
    public String getHttpPackageConfigurations() {
        return this.httpPackageConfigurations;
    }

    public UpdateSourceRequest setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public UpdateSourceRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public UpdateSourceRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
