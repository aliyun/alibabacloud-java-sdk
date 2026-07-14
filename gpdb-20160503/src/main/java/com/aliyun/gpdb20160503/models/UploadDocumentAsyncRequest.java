// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UploadDocumentAsyncRequest extends TeaModel {
    /**
     * <p>The size of overlapping data between consecutive chunks. The maximum value of this parameter cannot be greater than the value of the ChunkSize parameter.</p>
     * <blockquote>
     * <p> This parameter prevents context loss caused by data truncation. For example, when you upload long text, you can retain specific overlapping text content between consecutive chunks for better context understanding.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ChunkOverlap")
    public Integer chunkOverlap;

    /**
     * <p>The strategy for processing large data: the size of each chunk when data is split into smaller parts. Maximum value: 2048.</p>
     * 
     * <strong>example:</strong>
     * <p>250</p>
     */
    @NameInMap("ChunkSize")
    public Integer chunkSize;

    /**
     * <p>The name of the document collection.</p>
     * <blockquote>
     * <p>Created by the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> operation. You can call the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> operation to query the created document collections.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>The ID of the instance that has vector engine optimization enabled. You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in the target region, including instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the document loader. If you do not specify this parameter, the system automatically selects the corresponding document loader based on the file name extension in the following order. Valid values:</p>
     * <ul>
     * <li>UnstructuredHTMLLoader: .html</li>
     * <li>UnstructuredMarkdownLoader: .md</li>
     * <li>PyMuPDFLoader: .pdf</li>
     * <li>PyPDFLoader: .pdf</li>
     * <li>RapidOCRPDFLoader: .pdf</li>
     * <li>PDFWithImageRefLoader: .pdf (with the text-image association feature)</li>
     * <li>JSONLoader: .json</li>
     * <li>CSVLoader: .csv</li>
     * <li>RapidOCRLoader: .png, .jpg, .jpeg, and .bmp</li>
     * <li>UnstructuredFileLoader: .eml, .msg, .rst, .txt, .docx, .epub, .odt, .pptx, and .tsv</li>
     * <li>ADBPGLoader (paid, first 3,000 pages free): .pdf, .doc, .docx, .ppt, .pptx, .xls, .xlsx, .xlsm, .csv, .txt, .jpg, .jpeg, .png, .bmp, .gif, .md, .html, .epub, .mobi, and .rtf</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PyMuPDFLoader</p>
     */
    @NameInMap("DocumentLoaderName")
    public String documentLoaderName;

    /**
     * <p>Specifies whether to perform only document understanding and chunking without vectorization and storage. Default value: false.</p>
     * <blockquote>
     * <p> You can set this parameter to true to check the chunking results and then optimize as needed.</p>
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
     * <ul>
     * <li>The file name must include file name extension, such as .json, .md, or .pdf.</li>
     * <li>Supported image file extensions include .bmp, .jpg, .jpeg, .png, and .tiff.</li>
     * <li>You can upload images by using an archive. The archive file name must include file name extension. Supported archive extensions include .tar, .gz, and .zip.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mydoc.txt</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The publicly accessible URL of the document.</p>
     * <blockquote>
     * <p>Use the SDK to call this operation. The SDK provides a method named UploadDocumentAsyncAdvance that allows you to directly upload local files.
     * If the URL points to an image archive, the number of images in the archive cannot exceed 100.</p>
     * </blockquote>
     * <blockquote>
     * <p>Notice: 
     * The maximum size of an image uploaded by using multimodal-embedding-v1 is 3 MB.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xx/mydoc.txt">https://xx/mydoc.txt</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The metadata. The value of this parameter must be the same as the Metadata parameter specified when you call the CreateDocumentCollection operation.</p>
     */
    @NameInMap("Metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <p>The namespace. Default value: public. You can call the CreateNamespace operation to create a namespace and call the ListNamespaces operation to query the list of namespaces.</p>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The password of the namespace. The value is specified by the CreateNamespace operation.</p>
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
     * <p>The separators used to split large data.</p>
     * <blockquote>
     * <ul>
     * <li>This is an important parameter that determines the effectiveness of data chunking. This parameter is related to the splitter specified by the TextSplitterName parameter.</li>
     * <li>In most cases, you do not need to specify this parameter. The server assigns separators based on the value of the TextSplitterName parameter.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("Separators")
    public java.util.List<String> separators;

    /**
     * <p>The splitting model to use when DocumentLoaderName is set to ADBPGLoader and TextSplitterName is set to LLMSplitter. Default value: qwen3-8b.</p>
     * <blockquote>
     * <p>Currently supported splitting models:
     * qwq-plus, qwq-plus-latest,
     * qwen-max, qwen-max-latest,
     * qwen-plus, qwen-plus-latest,
     * qwen-turbo, qwen-turbo-latest,
     * qwen3-235b-a22b, qwen3-32b, qwen3-30b-a3b,
     * qwen3-14b, qwen3-8b, qwen3-4b, qwen3-1.7b, qwen3-0.6b,
     * qwq-32b
     * qwen2.5-14b-instruct-1m, qwen2.5-7b-instruct-1m
     * qwen2.5-72b-instruct, qwen2.5-32b-instruct,
     * qwen2.5-14b-instruct, qwen2.5-7b-instruct,
     * qwen2.5-3b-instruct, qwen2.5-1.5b-instruct, qwen2.5-0.5b-instruct</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>qwen3-8b</p>
     */
    @NameInMap("SplitterModel")
    public String splitterModel;

    /**
     * <p>The name of the text splitter. Valid values:</p>
     * <ul>
     * <li><strong>ChineseRecursiveTextSplitter</strong>: inherits from RecursiveCharacterTextSplitter and uses `[&quot;</li>
     * </ul>
     * <p>&quot;,&quot;
     * &quot;, &quot;。|!|?&quot;, &quot;\.\s|\!\s|\?\s&quot;, &quot;;|;\s&quot;, &quot;,|,\s&quot;]` as the default separators with regular expression matching.</p>
     * <ul>
     * <li><strong>RecursiveCharacterTextSplitter</strong>: uses `[&quot;</li>
     * </ul>
     * <p>&quot;, &quot;
     * &quot;, &quot; &quot;, &quot;&quot;]` as the default separators. This splitter supports splitting code in languages such as C++, Go, Java, JS, PHP, Proto, Python, RST, Ruby, Rust, Scala, Swift, Markdown, LaTeX, HTML, Sol, and C Sharp.</p>
     * <ul>
     * <li><strong>SpacyTextSplitter</strong>: uses `</li>
     * </ul>
     * <p>` as the default separator and the spaCy en_core_web_sm model. This splitter provides better splitting results.</p>
     * <ul>
     * <li><strong>MarkdownHeaderTextSplitter</strong>: splits text in the format of [(&quot;#&quot;, &quot;head1&quot;), (&quot;##&quot;, &quot;head2&quot;), (&quot;###&quot;, &quot;head3&quot;), (&quot;####&quot;, &quot;head4&quot;)]. This splitter is suitable for Markdown text.</li>
     * <li><strong>LLMSplitter</strong>: uses an LLM to split text. The default model is qwen3-8b. This splitter takes effect only when ADBPGLoader is selected as the document loader.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ChineseRecursiveTextSplitter</p>
     */
    @NameInMap("TextSplitterName")
    public String textSplitterName;

    /**
     * <p>Specifies whether to enable VL-enhanced content recognition for complex documents. Default value: false.</p>
     * <blockquote>
     * <ul>
     * <li>For complex documents with disorganized layouts and formats, enable VL-enhanced content recognition.</li>
     * <li>After VL-enhanced content recognition is enabled, document processing takes longer.</li>
     * <li>After VL-enhanced content recognition is enabled, images in the document cannot be stored or recalled.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VlEnhance")
    public Boolean vlEnhance;

    /**
     * <p>Specifies whether to enable title enhancement.</p>
     * <blockquote>
     * <p>You can identify the title text, mark the text in the metadata, and then combine the text with the upper-level title for text enhancement.</p>
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

    public UploadDocumentAsyncRequest setSplitterModel(String splitterModel) {
        this.splitterModel = splitterModel;
        return this;
    }
    public String getSplitterModel() {
        return this.splitterModel;
    }

    public UploadDocumentAsyncRequest setTextSplitterName(String textSplitterName) {
        this.textSplitterName = textSplitterName;
        return this;
    }
    public String getTextSplitterName() {
        return this.textSplitterName;
    }

    public UploadDocumentAsyncRequest setVlEnhance(Boolean vlEnhance) {
        this.vlEnhance = vlEnhance;
        return this;
    }
    public Boolean getVlEnhance() {
        return this.vlEnhance;
    }

    public UploadDocumentAsyncRequest setZhTitleEnhance(Boolean zhTitleEnhance) {
        this.zhTitleEnhance = zhTitleEnhance;
        return this;
    }
    public Boolean getZhTitleEnhance() {
        return this.zhTitleEnhance;
    }

}
