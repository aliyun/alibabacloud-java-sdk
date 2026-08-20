// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class CreateDocParserJobAdvanceRequest extends TeaModel {
    @NameInMap("AgentName")
    public String agentName;

    @NameInMap("AsrLanguage")
    public String asrLanguage;

    @NameInMap("AudioClipOutput")
    public Boolean audioClipOutput;

    @NameInMap("AudioWindowSeconds")
    public Integer audioWindowSeconds;

    @NameInMap("ChunkSummary")
    public Boolean chunkSummary;

    /**
     * <p>The format of the input file. Valid values:</p>
     * <ul>
     * <li><p><strong>pdf</strong>: PDF file.</p>
     * </li>
     * <li><p><strong>docx</strong>: Word file in docx format.</p>
     * </li>
     * <li><p><strong>doc</strong>: Word file in doc format.</p>
     * </li>
     * <li><p><strong>pptx</strong>: PPT file in pptx format.</p>
     * </li>
     * <li><p><strong>ppt</strong>: PPT file in ppt format.</p>
     * </li>
     * <li><p><strong>txt</strong>: plain text file.</p>
     * </li>
     * <li><p><strong>md</strong>: Markdown file.</p>
     * </li>
     * <li><p><strong>png</strong>: PNG image.</p>
     * </li>
     * <li><p><strong>jpg</strong>: JPG image.</p>
     * </li>
     * <li><p><strong>jpeg</strong>: JPEG image.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pdf</p>
     */
    @NameInMap("FileFormat")
    public String fileFormat;

    /**
     * <p>The file name, which must include the file name extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>document.pdf</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The HTTP or HTTPS URL of the file to be parsed.</p>
     * <blockquote>
     * <p>SDKs for various languages provide an additional <code>CreateDocParserJobAdvance</code> method that supports passing a local file stream directly (such as InputStream in Java), without the need to upload the file to OSS and construct a FileUrl in advance. When using the Advance method, replace the <code>FileUrl</code> parameter (URL string) with the <code>FileUrlObject</code> parameter (file stream). All other request parameters remain unchanged. The SDK automatically performs the following operations:</p>
     * <ol>
     * <li>Obtains temporary OSS upload credentials.</li>
     * <li>Uploads the file stream directly to OSS.</li>
     * <li>Calls the CreateDocParserJob operation with the generated OSS URL.</li>
     * </ol>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.oss-cn-beijing.aliyuncs.com/document.pdf?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://xxx.oss-cn-beijing.aliyuncs.com/document.pdf?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
     */
    @NameInMap("FileUrl")
    public java.io.InputStream fileUrlObject;

    @NameInMap("FrameOutput")
    public Boolean frameOutput;

    @NameInMap("GlobalSummary")
    public Boolean globalSummary;

    @NameInMap("ImageMode")
    public String imageMode;

    @NameInMap("ImageUnderstanding")
    public String imageUnderstanding;

    @NameInMap("MediaChunkIntervalSeconds")
    public Integer mediaChunkIntervalSeconds;

    @NameInMap("MediaChunkStrategy")
    public String mediaChunkStrategy;

    @NameInMap("MediaFramesPerMinute")
    public Double mediaFramesPerMinute;

    @NameInMap("MediaMaxFrameBudget")
    public Integer mediaMaxFrameBudget;

    @NameInMap("MediaMinFrameBudget")
    public Integer mediaMinFrameBudget;

    /**
     * <p>The OSS file URL.</p>
     */
    @NameInMap("OssFileUrl")
    public String ossFileUrl;

    /**
     * <p>The output format of the parsing result. Valid values:</p>
     * <ul>
     * <li><strong>markdown</strong>: Markdown format.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>markdown</p>
     */
    @NameInMap("OutputFormat")
    public String outputFormat;

    @NameInMap("ParseScene")
    public String parseScene;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResponseMode")
    public String responseMode;

    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("TableFormat")
    public String tableFormat;

    public static CreateDocParserJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDocParserJobAdvanceRequest self = new CreateDocParserJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDocParserJobAdvanceRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public CreateDocParserJobAdvanceRequest setAsrLanguage(String asrLanguage) {
        this.asrLanguage = asrLanguage;
        return this;
    }
    public String getAsrLanguage() {
        return this.asrLanguage;
    }

    public CreateDocParserJobAdvanceRequest setAudioClipOutput(Boolean audioClipOutput) {
        this.audioClipOutput = audioClipOutput;
        return this;
    }
    public Boolean getAudioClipOutput() {
        return this.audioClipOutput;
    }

    public CreateDocParserJobAdvanceRequest setAudioWindowSeconds(Integer audioWindowSeconds) {
        this.audioWindowSeconds = audioWindowSeconds;
        return this;
    }
    public Integer getAudioWindowSeconds() {
        return this.audioWindowSeconds;
    }

    public CreateDocParserJobAdvanceRequest setChunkSummary(Boolean chunkSummary) {
        this.chunkSummary = chunkSummary;
        return this;
    }
    public Boolean getChunkSummary() {
        return this.chunkSummary;
    }

    public CreateDocParserJobAdvanceRequest setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }

    public CreateDocParserJobAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateDocParserJobAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

    public CreateDocParserJobAdvanceRequest setFrameOutput(Boolean frameOutput) {
        this.frameOutput = frameOutput;
        return this;
    }
    public Boolean getFrameOutput() {
        return this.frameOutput;
    }

    public CreateDocParserJobAdvanceRequest setGlobalSummary(Boolean globalSummary) {
        this.globalSummary = globalSummary;
        return this;
    }
    public Boolean getGlobalSummary() {
        return this.globalSummary;
    }

    public CreateDocParserJobAdvanceRequest setImageMode(String imageMode) {
        this.imageMode = imageMode;
        return this;
    }
    public String getImageMode() {
        return this.imageMode;
    }

    public CreateDocParserJobAdvanceRequest setImageUnderstanding(String imageUnderstanding) {
        this.imageUnderstanding = imageUnderstanding;
        return this;
    }
    public String getImageUnderstanding() {
        return this.imageUnderstanding;
    }

    public CreateDocParserJobAdvanceRequest setMediaChunkIntervalSeconds(Integer mediaChunkIntervalSeconds) {
        this.mediaChunkIntervalSeconds = mediaChunkIntervalSeconds;
        return this;
    }
    public Integer getMediaChunkIntervalSeconds() {
        return this.mediaChunkIntervalSeconds;
    }

    public CreateDocParserJobAdvanceRequest setMediaChunkStrategy(String mediaChunkStrategy) {
        this.mediaChunkStrategy = mediaChunkStrategy;
        return this;
    }
    public String getMediaChunkStrategy() {
        return this.mediaChunkStrategy;
    }

    public CreateDocParserJobAdvanceRequest setMediaFramesPerMinute(Double mediaFramesPerMinute) {
        this.mediaFramesPerMinute = mediaFramesPerMinute;
        return this;
    }
    public Double getMediaFramesPerMinute() {
        return this.mediaFramesPerMinute;
    }

    public CreateDocParserJobAdvanceRequest setMediaMaxFrameBudget(Integer mediaMaxFrameBudget) {
        this.mediaMaxFrameBudget = mediaMaxFrameBudget;
        return this;
    }
    public Integer getMediaMaxFrameBudget() {
        return this.mediaMaxFrameBudget;
    }

    public CreateDocParserJobAdvanceRequest setMediaMinFrameBudget(Integer mediaMinFrameBudget) {
        this.mediaMinFrameBudget = mediaMinFrameBudget;
        return this;
    }
    public Integer getMediaMinFrameBudget() {
        return this.mediaMinFrameBudget;
    }

    public CreateDocParserJobAdvanceRequest setOssFileUrl(String ossFileUrl) {
        this.ossFileUrl = ossFileUrl;
        return this;
    }
    public String getOssFileUrl() {
        return this.ossFileUrl;
    }

    public CreateDocParserJobAdvanceRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public CreateDocParserJobAdvanceRequest setParseScene(String parseScene) {
        this.parseScene = parseScene;
        return this;
    }
    public String getParseScene() {
        return this.parseScene;
    }

    public CreateDocParserJobAdvanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDocParserJobAdvanceRequest setResponseMode(String responseMode) {
        this.responseMode = responseMode;
        return this;
    }
    public String getResponseMode() {
        return this.responseMode;
    }

    public CreateDocParserJobAdvanceRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public CreateDocParserJobAdvanceRequest setTableFormat(String tableFormat) {
        this.tableFormat = tableFormat;
        return this;
    }
    public String getTableFormat() {
        return this.tableFormat;
    }

}
