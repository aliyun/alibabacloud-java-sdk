// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UploadDocumentAsyncShrinkRequest extends TeaModel {
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
     * <p>Strategy for processing large data: the size of each chunk when the data is split into smaller parts. Maximum value is 2048.</p>
     * 
     * <strong>example:</strong>
     * <p>250</p>
     */
    @NameInMap("ChunkSize")
    public Integer chunkSize;

    /**
     * <p>The name of the document library. </p>
     * <blockquote>
     * <p>Created by the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> API. You can call the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> API to view the document libraries that have already been created.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <p>Instance ID with vector engine optimization acceleration enabled. You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> API to view details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies the document loader to use for processing the file. If this parameter is omitted, the system automatically selects a loader based on the file\&quot;s extension.Valid Values:[List of valid loader names would go here] Valid values:</p>
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
     * <li>ADBPGLoader (free of charge for the first 3,000 pages): .pdf, .doc, .docx, .ppt, .pptx, .xls, .xlsx, .xlsm, .csv, .txt, .jpg, .jpeg, .png, .bmp, .gif, .md, .html, .epub, .mobi, and .rtf</li>
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
     * <p>The name of the file being uploaded.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>File name: .json, .md, and .pdf.</p>
     * </li>
     * <li><p>Images: .bmp,. jpg,. jpeg,. png, and. tiff.</p>
     * </li>
     * <li><p>Compressed packages. The package file name must contain an extension: .tar, .gz, and .zip.</p>
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
     * <p>The URL of the publicly accessible document.</p>
     * <blockquote>
     * <blockquote>
     * <ul>
     * <li>It is recommended to call this interface using the SDK, which provides a method called UploadDocumentAsyncAdvance for directly uploading local files. &gt; - If the URL points to an image archive, the number of images in the archive should not exceed 100.</li>
     * </ul>
     * </blockquote>
     * </blockquote>
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
    public String metadataShrink;

    /**
     * <p>Namespace, default is public. You can create one through the CreateNamespace interface and view the list via the ListNamespaces interface.</p>
     * 
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The password corresponding to the namespace.  &gt; This value is specified by the CreateNamespace interface.</p>
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
    public String separatorsShrink;

    /**
     * <p>When DocumentLoaderName is set to ADBPGLoader and TextSplitterName is set to LLMSplitter, you can specify the splitting model. Default Value: qwen3-8b.</p>
     * <blockquote>
     * <p> Supported splitting models: qwq-plus, qwq-plus-latest, qwen-max, qwen-max-latest, qwen-plus, qwen-plus-latest, qwen-turbo, qwen-turbo-latest, qwen3-235b-a22b, qwen3-32b,qwen3-30b-a3b, qwen3-14b, qwen3-8b, qwen3-4b, qwen3-1.7b, qwen3-0.6b, qwq-32b qwen2.5-14b-instruct-1m, qwen2.5-7b-instruct-1m, qwen2.5-72b-Instruct, qwen2.5-32b-Instruct, qwen2.5-14b-Instruct, qwen2.5-7b-Instruct, qwen2.5-3b-instruct, qwen2.5-1.5b-instruct, qwen2.5-0.5b-instruct.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>qwen3-8b</p>
     */
    @NameInMap("SplitterModel")
    public String splitterModel;

    /**
     * <p>The name of the separator. Valid values:</p>
     * <ul>
     * <li><strong>ChineseRecursiveTextSplitter</strong>: Inherits from RecursiveCharacterTextSplitter and, by default, uses the delimiters<code>[&quot;\\n\\n&quot;,&quot;\\n&quot;, &quot;。 |! |?&quot;, &quot;\\.\\s|\\! \\s|\\?\\s&quot;, &quot;;|;\\s&quot;, &quot;,|,\\s&quot;] </code>, employing regular expressions to match text.</li>
     * <li><strong>RecursiveCharacterTextSplitter</strong>: Uses the delimiters <code>[&quot;\\n\\n&quot;, &quot;\\n&quot;, &quot; &quot;, &quot;&quot;]</code> by default. The splitter supports splitting code in languages such as C++, Go, Java, JS, PHP, Proto, Python, RST, Ruby, Rust, Scala, Swift, Markdown, LaTeX, HTML, Sol, and C Sharp.</li>
     * <li><strong>SpacyTextSplitter</strong>: Uses the delimiters <code>\\n\\n</code> by default and leverages the spaCy en_core_web_sm model. The splitter can achieve better text splitting performance.</li>
     * <li><strong>MarkdownHeaderTextSplitter</strong>: Splits text in the [(&quot;#&quot;, &quot;head1&quot;), (&quot;##&quot;, &quot;head2&quot;), (&quot;###&quot;, &quot;head3&quot;), (&quot;####&quot;, &quot;head4&quot;) format. This splitter works well with Markdown text.</li>
     * <li><strong>LLMSplitter</strong>: Use LLM to split text. The default model is qwen3-8b. Currently, this splitter works only when ADBPGLoader is selected.</li>
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
     * </blockquote>
     * <ul>
     * <li><p>For complex documents with confusing typesetting and formatting, we recommend that you enable VL-enhanced content recognition.</p>
     * </li>
     * <li><p>Document processing time is longer after VL-enhanced content recognition is enabled.</p>
     * </li>
     * <li><p>After VL-enhanced content recognition is enabled, images in documents cannot be stored or recalled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VlEnhance")
    public Boolean vlEnhance;

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

    public static UploadDocumentAsyncShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDocumentAsyncShrinkRequest self = new UploadDocumentAsyncShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UploadDocumentAsyncShrinkRequest setChunkOverlap(Integer chunkOverlap) {
        this.chunkOverlap = chunkOverlap;
        return this;
    }
    public Integer getChunkOverlap() {
        return this.chunkOverlap;
    }

    public UploadDocumentAsyncShrinkRequest setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    public UploadDocumentAsyncShrinkRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public UploadDocumentAsyncShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UploadDocumentAsyncShrinkRequest setDocumentLoaderName(String documentLoaderName) {
        this.documentLoaderName = documentLoaderName;
        return this;
    }
    public String getDocumentLoaderName() {
        return this.documentLoaderName;
    }

    public UploadDocumentAsyncShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UploadDocumentAsyncShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadDocumentAsyncShrinkRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadDocumentAsyncShrinkRequest setMetadataShrink(String metadataShrink) {
        this.metadataShrink = metadataShrink;
        return this;
    }
    public String getMetadataShrink() {
        return this.metadataShrink;
    }

    public UploadDocumentAsyncShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UploadDocumentAsyncShrinkRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public UploadDocumentAsyncShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UploadDocumentAsyncShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UploadDocumentAsyncShrinkRequest setSeparatorsShrink(String separatorsShrink) {
        this.separatorsShrink = separatorsShrink;
        return this;
    }
    public String getSeparatorsShrink() {
        return this.separatorsShrink;
    }

    public UploadDocumentAsyncShrinkRequest setSplitterModel(String splitterModel) {
        this.splitterModel = splitterModel;
        return this;
    }
    public String getSplitterModel() {
        return this.splitterModel;
    }

    public UploadDocumentAsyncShrinkRequest setTextSplitterName(String textSplitterName) {
        this.textSplitterName = textSplitterName;
        return this;
    }
    public String getTextSplitterName() {
        return this.textSplitterName;
    }

    public UploadDocumentAsyncShrinkRequest setVlEnhance(Boolean vlEnhance) {
        this.vlEnhance = vlEnhance;
        return this;
    }
    public Boolean getVlEnhance() {
        return this.vlEnhance;
    }

    public UploadDocumentAsyncShrinkRequest setZhTitleEnhance(Boolean zhTitleEnhance) {
        this.zhTitleEnhance = zhTitleEnhance;
        return this;
    }
    public Boolean getZhTitleEnhance() {
        return this.zhTitleEnhance;
    }

}
