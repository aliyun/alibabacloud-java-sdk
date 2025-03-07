// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateSourceRequest extends TeaModel {
    /**
     * <p>The source configurations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>“[{
     *     &quot;sourceGroupName&quot;: &quot;mySourceGroup-1&quot;,
     *     &quot;relativePath&quot;: &quot;group1/hls.m3u8&quot;,
     *     &quot;type&quot;: &quot;hls&quot;
     * }]”</p>
     */
    @NameInMap("HttpPackageConfigurations")
    public String httpPackageConfigurations;

    /**
     * <p>The name of the source location.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySourceLocation</p>
     */
    @NameInMap("SourceLocationName")
    public String sourceLocationName;

    /**
     * <p>The name of the source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyVodSource</p>
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

    public static CreateSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSourceRequest self = new CreateSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSourceRequest setHttpPackageConfigurations(String httpPackageConfigurations) {
        this.httpPackageConfigurations = httpPackageConfigurations;
        return this;
    }
    public String getHttpPackageConfigurations() {
        return this.httpPackageConfigurations;
    }

    public CreateSourceRequest setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public CreateSourceRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public CreateSourceRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
