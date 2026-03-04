// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ChannelAssemblySource extends TeaModel {
    /**
     * <p>The ARN of the source.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ims:mediaweaver:<regionId>:<userId>:vodSource/mySourceLocation/mySource</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <p>The time when the source was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-20T07:15:51Z</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The time when the source was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-07T10:12:01Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The source configuration.</p>
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
     * 
     * <strong>example:</strong>
     * <p>MySourceLocation</p>
     */
    @NameInMap("SourceLocationName")
    public String sourceLocationName;

    /**
     * <p>The name of the source.</p>
     * 
     * <strong>example:</strong>
     * <p>MyVodSource</p>
     */
    @NameInMap("SourceName")
    public String sourceName;

    /**
     * <p>The source type. Valid values: vodSource and liveSource.</p>
     * 
     * <strong>example:</strong>
     * <p>vodSource</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The status of the source. 0: normal. 1: deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("State")
    public Integer state;

    public static ChannelAssemblySource build(java.util.Map<String, ?> map) throws Exception {
        ChannelAssemblySource self = new ChannelAssemblySource();
        return TeaModel.build(map, self);
    }

    public ChannelAssemblySource setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public ChannelAssemblySource setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ChannelAssemblySource setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ChannelAssemblySource setHttpPackageConfigurations(String httpPackageConfigurations) {
        this.httpPackageConfigurations = httpPackageConfigurations;
        return this;
    }
    public String getHttpPackageConfigurations() {
        return this.httpPackageConfigurations;
    }

    public ChannelAssemblySource setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public ChannelAssemblySource setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public ChannelAssemblySource setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ChannelAssemblySource setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

}
