// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UploadDocumentAsyncRequest extends TeaModel {
    /**
     * <p>The size of data that is overlapped between consecutive chunks. The maximum value of this parameter cannot be greater than the value of the ChunkSize parameter.</p>
     * <blockquote>
     * <p> This parameter is used to prevent context missing that may occur due to data truncation. For example, when you upload a long text, you can retain specific overlapped text content between consecutive chunks to better understand the context.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ChunkOverlap")
    public Integer chunkOverlap;

    /**
     * <strong>example:</strong>
     * <p>250</p>
     */
    @NameInMap("ChunkSize")
    public Integer chunkSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the document loader. You do not need to specify this parameter. A document loader is automatically specified based on the file extension. Valid values:</p>
     * <ul>
     * <li>UnstructuredHTMLLoader: <code>.html</code></li>
     * <li>UnstructuredMarkdownLoader: <code>.md</code></li>
     * <li>PyMuPDFLoader: <code>.pdf</code></li>
     * <li>PyPDFLoader: <code>.pdf</code></li>
     * <li>RapidOCRPDFLoader: <code>.pdf</code></li>
     * <li>PDFWithImageRefLoader: <code>.pdf</code> (with the text-image association feature)</li>
     * <li>JSONLoader: <code>.json</code></li>
     * <li>CSVLoader: <code>.csv</code></li>
     * <li>RapidOCRLoader: <code>.png</code>, <code>.jpg</code>, <code>.jpeg</code>, and <code>.bmp</code></li>
     * <li>UnstructuredFileLoader: <code>.eml</code>, <code>.msg</code>, <code>.rst</code>, <code>.txt</code>, <code>.docx</code>, <code>.epub</code>, <code>.odt</code>, <code>.pptx</code>, and <code>.tsv</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PyMuPDFLoader</p>
     */
    @NameInMap("DocumentLoaderName")
    public String documentLoaderName;

    /**
     * <p>Specifies whether to perform only document understanding and chunking, but not vectorization and storage. Default value: false.</p>
     * <blockquote>
     * <p> You can set this parameter to true, check the chunking effect, and then perform optimization if needed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The file name of the document.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>We recommend that you add an extension to the file name. Examples: <code>.json</code>, <code>.md</code>, and <code>.pdf</code>. If you do not add an extension, the default loader designed for unstructured data is used.</p>
     * </li>
     * <li><p>If an image file is involved, the file name must contain an extension. The following extensions are supported: <code>.bmp</code>, <code>.jpg</code>, <code>.jpeg</code>, <code>.png</code>, and <code>.tiff</code>.</p>
     * </li>
     * <li><p>You can use a compressed package to upload images. The package file name must contain an extension. Supported package file extensions: <code>.tar</code>, <code>.gz</code>, and <code>.zip</code>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mydoc.txt</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xx/mydoc.txt">https://xx/mydoc.txt</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The metadata. The value of this parameter must be the same as the Metadata parameter that is specified when you call the CreateDocumentCollection operation.</p>
     */
    @NameInMap("Metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testpassword</p>
     */
    @NameInMap("NamespacePassword")
    public String namespacePassword;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The separators that are used to split large amounts of data.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This is an important parameter that determines the chunking effect. This parameter is related to the splitter that is specified by the TextSplitterName parameter.</p>
     * </li>
     * <li><p>In most cases, you do not need to specify this parameter. The server assigns separators based on the value of the TextSplitterName parameter.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Separators")
    public java.util.List<String> separators;

    /**
     * <p>The name of the splitter. Valid values:</p>
     * <ul>
     * <li><strong>ChineseRecursiveTextSplitter</strong>: inherits from RecursiveCharacterTextSplitter, uses <code>[&quot;\\n\\n&quot;,&quot;\\n&quot;, &quot;。|!|?&quot;, &quot;\\.\\s|\\!\\s|\\?\\s&quot;, &quot;;|;\\s&quot;, &quot;,|,\\s&quot;]</code> as separators by default, and uses regular expressions to match text.</li>
     * <li><strong>RecursiveCharacterTextSplitter</strong>: uses <code>[&quot;\\n\\n&quot;, &quot;\\n&quot;, &quot; &quot;, &quot;&quot;]</code> as separators by default. The splitter supports splitting code in languages such as <code>C++, Go, Java, JS, PHP, Proto, Python, RST, Ruby, Rust, Scala, Swift, Markdown, LaTeX, HTML, Sol, and C Sharp</code>.</li>
     * <li><strong>SpacyTextSplitter</strong>: uses <code>\\n\\n</code> as separators by default and uses the en_core_web_sm model of spaCy. The splitter can obtain better splitting effect.</li>
     * <li><strong>MarkdownHeaderTextSplitter</strong>: splits text in the <code>[(&quot;#&quot;, &quot;head1&quot;), (&quot;##&quot;, &quot;head2&quot;), (&quot;###&quot;, &quot;head3&quot;), (&quot;####&quot;, &quot;head4&quot;)]</code> format. The splitter is suitable for Markdown text.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ChineseRecursiveTextSplitter</p>
     */
    @NameInMap("TextSplitterName")
    public String textSplitterName;

    /**
     * <p>Specifies whether to enable title enhancement.</p>
     * <blockquote>
     * <p> You can determine the title text, mark the text in the metadata, and then combine the text with the upper-level title to implement text enhancement.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ZhTitleEnhance")
    public Boolean zhTitleEnhance;

    public static UploadDocumentAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDocumentAsyncRequest self = new UploadDocumentAsyncRequest();
        return TeaModel.build(map, self);
    }

    public UploadDocumentAsyncRequest setChunkOverlap(Integer chunkOverlap) {
        this.chunkOverlap = chunkOverlap;
        return this;
    }
    public Integer getChunkOverlap() {
        return this.chunkOverlap;
    }

    public UploadDocumentAsyncRequest setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    public UploadDocumentAsyncRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public UploadDocumentAsyncRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UploadDocumentAsyncRequest setDocumentLoaderName(String documentLoaderName) {
        this.documentLoaderName = documentLoaderName;
        return this;
    }
    public String getDocumentLoaderName() {
        return this.documentLoaderName;
    }

    public UploadDocumentAsyncRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UploadDocumentAsyncRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadDocumentAsyncRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadDocumentAsyncRequest setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public UploadDocumentAsyncRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UploadDocumentAsyncRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public UploadDocumentAsyncRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UploadDocumentAsyncRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UploadDocumentAsyncRequest setSeparators(java.util.List<String> separators) {
        this.separators = separators;
        return this;
    }
    public java.util.List<String> getSeparators() {
        return this.separators;
    }

    public UploadDocumentAsyncRequest setTextSplitterName(String textSplitterName) {
        this.textSplitterName = textSplitterName;
        return this;
    }
    public String getTextSplitterName() {
        return this.textSplitterName;
    }

    public UploadDocumentAsyncRequest setZhTitleEnhance(Boolean zhTitleEnhance) {
        this.zhTitleEnhance = zhTitleEnhance;
        return this;
    }
    public Boolean getZhTitleEnhance() {
        return this.zhTitleEnhance;
    }

}
