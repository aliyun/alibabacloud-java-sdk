// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateOfficeConversionTaskRequest extends TeaModel {
    /**
     * <p><strong>If you do not have special requirements, leave this parameter empty.</strong></p>
     * <p>The chained authorization configuration. This parameter is not required. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The end page for the document conversion. The default value is -1, which indicates that all pages from the start page to the last page are converted.</p>
     * <blockquote>
     * <ul>
     * <li><p>If the source file is a spreadsheet, you must specify the worksheet number (\<code>SheetIndex\\</code>).</p>
     * </li>
     * <li><p>If the document has many pages, we recommend that you convert them in batches. Otherwise, the conversion may time out.</p>
     * </li>
     * <li><p>This parameter takes effect only when you convert the document to images. It does not take effect when you convert the document to a PDF file or a text file.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("EndPage")
    public Long endPage;

    /**
     * <p>When you convert a spreadsheet document to images, specifies whether to return only the first image of the conversion result. The number of rows and columns in the image is the result of automatic splitting. Valid values:</p>
     * <ul>
     * <li><p>false (default): No. All images are returned.</p>
     * </li>
     * <li><p>true: Yes. Only the first image is returned. This is used to extract a thumbnail.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only if you set the <strong>LongPicture</strong> parameter to <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FirstPage")
    public Boolean firstPage;

    /**
     * <p>When you convert a spreadsheet document to images or a PDF file, specifies whether to render all rows on a single image or PDF page. Valid values:</p>
     * <ul>
     * <li><p>false (default): No. The content is rendered on multiple images or PDF pages.</p>
     * </li>
     * <li><p>true: Yes. The content is rendered on a single image or PDF page.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FitToHeight")
    public Boolean fitToHeight;

    /**
     * <p>When you convert a spreadsheet document to images or a PDF file, specifies whether to render all columns on a single image or PDF page. Valid values:</p>
     * <ul>
     * <li><p>false (default): No. The content is rendered on multiple images or PDF pages.</p>
     * </li>
     * <li><p>true: Yes. The content is rendered on a single image or PDF page.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FitToWidth")
    public Boolean fitToWidth;

    /**
     * <p>When you convert a document to text, specifies whether to keep the line feeds in the document. Valid values:</p>
     * <ul>
     * <li><p>false (default): No. Line feeds are not kept.</p>
     * </li>
     * <li><p>true: Yes. Line feeds are kept.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HoldLineFeed")
    public Boolean holdLineFeed;

    /**
     * <p>The DPI of the output image. Valid values: 96 to 600. The default value is 96.</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("ImageDPI")
    public Long imageDPI;

    /**
     * <p>When you convert a document to images, specifies whether to convert it into a long image. Valid values:</p>
     * <ul>
     * <li><p>false (default): No. The document is converted into multiple images.</p>
     * </li>
     * <li><p>true: Yes. The document is converted into a long image.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can combine a maximum of 20 pages into a long image. If the number of pages exceeds this limit, the conversion task may fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LongPicture")
    public Boolean longPicture;

    /**
     * <p>When you convert a document to text, specifies whether to convert it into a long text file. Valid values:</p>
     * <ul>
     * <li><p>false (default): No. Each page of the document is converted into a separate text file.</p>
     * </li>
     * <li><p>true: Yes. All content is placed in a single text file.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LongText")
    public Boolean longText;

    /**
     * <p>The maximum number of columns to convert when you convert a spreadsheet document to images. By default, all columns are converted.</p>
     * <blockquote>
     * <p>This parameter takes effect only when you set <strong>LongPicture</strong> to <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxSheetColumn")
    public Long maxSheetColumn;

    /**
     * <p>The maximum number of rows to convert when you convert a spreadsheet document to images. By default, all rows are converted.</p>
     * <blockquote>
     * <p>This parameter takes effect only when you set <strong>LongPicture</strong> to <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxSheetRow")
    public Long maxSheetRow;

    /**
     * <p>The message notification configuration. For more information, click Notification. For more information about the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The page numbers to convert. This parameter has a higher priority than the \<code>StartPage\\</code> and \<code>EndPage\\</code> parameters. The format is as follows:</p>
     * <ul>
     * <li><p>Separate multiple page numbers with commas (,), for example, 1,2.</p>
     * </li>
     * <li><p>Specify a range of consecutive pages with a hyphen (-), for example, 1,2-4,7.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1,2-4,7</p>
     */
    @NameInMap("Pages")
    public String pages;

    /**
     * <p>When you convert a spreadsheet document to images, specifies whether to place the paper horizontally. The output image is similar to a printed page. Valid values:</p>
     * <ul>
     * <li><p>false (default): No. The paper is placed vertically.</p>
     * </li>
     * <li><p>true: Yes. The paper is placed horizontally.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PaperHorizontal")
    public Boolean paperHorizontal;

    /**
     * <p>The paper size for converting a spreadsheet document to images. The output image is similar to a printed page. Valid values:</p>
     * <ul>
     * <li><p>A0</p>
     * </li>
     * <li><p>A2</p>
     * </li>
     * <li><p>A4 (default)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when you use it with the <strong>FitToHeight</strong> and <strong>FitToWidth</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>A4</p>
     */
    @NameInMap("PaperSize")
    public String paperSize;

    /**
     * <p>The password to open the document. Set this parameter if you want to convert a password-protected document.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The project name. For more information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The quality of the converted file. Valid values: 0 to 100. A value of 0 indicates the lowest quality and the best performance. A value of 100 indicates the highest quality and the poorest performance. By default, the system sets an appropriate value based on the document content to balance quality and performance.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Quality")
    public Long quality;

    /**
     * <p>The scaling ratio of the document. Valid values: 20 to 199. The default value is 100, which indicates that the document is not scaled.</p>
     * <blockquote>
     * <p>A value less than 100 indicates that the document is scaled down. A value greater than 100 indicates that the document is scaled up.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ScalePercentage")
    public Long scalePercentage;

    /**
     * <p>The number of worksheets to convert to images in the spreadsheet document. By default, all worksheets are converted.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SheetCount")
    public Long sheetCount;

    /**
     * <p>The number of the worksheet to convert to images in the spreadsheet document. Valid values: 1 to the number of the last worksheet. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SheetIndex")
    public Long sheetIndex;

    /**
     * <p>When you convert a word processor document to images, specifies whether to show comments. Valid values:</p>
     * <ul>
     * <li><p>false (default): No. Comments are not shown.</p>
     * </li>
     * <li><p>true: Yes. Comments are shown.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowComments")
    public Boolean showComments;

    /**
     * <p>The extension type of the source data. By default, the type of the source data is determined by the extension of the OSS object. If the OSS object does not have an extension, you can set this parameter. Valid values:</p>
     * <ul>
     * <li><p>Word processor documents (Word): doc, docx, wps, wpss, docm, dotm, dot, and dotx</p>
     * </li>
     * <li><p>Presentation documents (PowerPoint): pptx, ppt, pot, potx, pps, ppsx, dps, dpt, pptm, potm, ppsm, and dpss</p>
     * </li>
     * <li><p>Spreadsheet documents (Excel): xls, xlt, et, ett, xlsx, xltx, csv, xlsb, xlsm, xltm, and ets</p>
     * </li>
     * <li><p>PDF documents: pdf</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>doc</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The storage address of the source data.</p>
     * <p>The OSS address must be in the oss\://${Bucket}/${Object} format. \<code>${Bucket}\\</code> is the name of the OSS bucket that is in the same region as the current project. \<code>${Object}\\</code> is the full path of the file, including the file name extension.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>A list of input images. The images are converted in the order of their URIs in the list. (<strong>This parameter is not yet published. Do not use it.</strong>)</p>
     * 
     * <strong>example:</strong>
     * <p>oss://imm-test/test.pptx</p>
     */
    @NameInMap("Sources")
    public java.util.List<CreateOfficeConversionTaskRequestSources> sources;

    /**
     * <p>The start page for the document conversion. The default value is 1.</p>
     * <blockquote>
     * <ul>
     * <li><p>If the source file is a spreadsheet, you must specify the worksheet number.</p>
     * </li>
     * <li><p>This parameter takes effect only when you convert the document to images. It does not take effect when you convert the document to a PDF file or a text file.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StartPage")
    public Long startPage;

    /**
     * <p>The custom tags. The value is a dictionary. You can use tags to search for tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;key&quot;: &quot;value&quot;
     * }</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The type of the output file. Valid values:</p>
     * <ul>
     * <li><p>png: Converts the document to PNG images.</p>
     * </li>
     * <li><p>jpg: Converts the document to JPG images.</p>
     * </li>
     * <li><p>pdf: Converts the document to a PDF file.</p>
     * </li>
     * <li><p>txt: Converts the document to a text-only file. This is mainly used to extract text content from the file. This option is supported only for presentation documents, word processor documents, and spreadsheet documents. When you convert a spreadsheet document, a single txt file is generated, and settings for sheet-related variables do not take effect.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>png</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The template for the output address of the converted document.</p>
     * <p>The address must be in the <code>oss://{bucket}/{tags.custom}/{dirname}/{barename}.{autoext}</code> format. For more information, see <a href="https://help.aliyun.com/document_detail/465762.html">TargetURI templates</a>.</p>
     * <blockquote>
     * <p>Specify either this parameter or \<code>TargetURIPrefix\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket/outputDocument.pdf</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>The prefix of the storage address for the output file after document conversion.</p>
     * <p>The prefix must be in the <code>oss://${Bucket}/${Prefix}/</code> format. \<code>${Bucket}\\</code> is the name of the OSS bucket that is in the same region as the current project. \<code>${Prefix}\\</code> is the prefix of the storage address for the output file.</p>
     * <blockquote>
     * <p>Specify either this parameter or \<code>TargetURI\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket/outputprefix/</p>
     */
    @NameInMap("TargetURIPrefix")
    public String targetURIPrefix;

    /**
     * <p>The trimming policy for spreadsheet conversion. For example, if a spreadsheet contains many empty rows and columns, a large amount of white space may be generated if no trimming policy is specified.</p>
     */
    @NameInMap("TrimPolicy")
    public TrimPolicy trimPolicy;

    /**
     * <p>The custom information. This information is returned in the asynchronous notification message to help you associate the notification with your services. The value can be up to 2,048 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;id&quot;: &quot;test-id&quot;,
     *       &quot;name&quot;: &quot;test-name&quot;
     * }</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateOfficeConversionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOfficeConversionTaskRequest self = new CreateOfficeConversionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOfficeConversionTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateOfficeConversionTaskRequest setEndPage(Long endPage) {
        this.endPage = endPage;
        return this;
    }
    public Long getEndPage() {
        return this.endPage;
    }

    public CreateOfficeConversionTaskRequest setFirstPage(Boolean firstPage) {
        this.firstPage = firstPage;
        return this;
    }
    public Boolean getFirstPage() {
        return this.firstPage;
    }

    public CreateOfficeConversionTaskRequest setFitToHeight(Boolean fitToHeight) {
        this.fitToHeight = fitToHeight;
        return this;
    }
    public Boolean getFitToHeight() {
        return this.fitToHeight;
    }

    public CreateOfficeConversionTaskRequest setFitToWidth(Boolean fitToWidth) {
        this.fitToWidth = fitToWidth;
        return this;
    }
    public Boolean getFitToWidth() {
        return this.fitToWidth;
    }

    public CreateOfficeConversionTaskRequest setHoldLineFeed(Boolean holdLineFeed) {
        this.holdLineFeed = holdLineFeed;
        return this;
    }
    public Boolean getHoldLineFeed() {
        return this.holdLineFeed;
    }

    public CreateOfficeConversionTaskRequest setImageDPI(Long imageDPI) {
        this.imageDPI = imageDPI;
        return this;
    }
    public Long getImageDPI() {
        return this.imageDPI;
    }

    public CreateOfficeConversionTaskRequest setLongPicture(Boolean longPicture) {
        this.longPicture = longPicture;
        return this;
    }
    public Boolean getLongPicture() {
        return this.longPicture;
    }

    public CreateOfficeConversionTaskRequest setLongText(Boolean longText) {
        this.longText = longText;
        return this;
    }
    public Boolean getLongText() {
        return this.longText;
    }

    public CreateOfficeConversionTaskRequest setMaxSheetColumn(Long maxSheetColumn) {
        this.maxSheetColumn = maxSheetColumn;
        return this;
    }
    public Long getMaxSheetColumn() {
        return this.maxSheetColumn;
    }

    public CreateOfficeConversionTaskRequest setMaxSheetRow(Long maxSheetRow) {
        this.maxSheetRow = maxSheetRow;
        return this;
    }
    public Long getMaxSheetRow() {
        return this.maxSheetRow;
    }

    public CreateOfficeConversionTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateOfficeConversionTaskRequest setPages(String pages) {
        this.pages = pages;
        return this;
    }
    public String getPages() {
        return this.pages;
    }

    public CreateOfficeConversionTaskRequest setPaperHorizontal(Boolean paperHorizontal) {
        this.paperHorizontal = paperHorizontal;
        return this;
    }
    public Boolean getPaperHorizontal() {
        return this.paperHorizontal;
    }

    public CreateOfficeConversionTaskRequest setPaperSize(String paperSize) {
        this.paperSize = paperSize;
        return this;
    }
    public String getPaperSize() {
        return this.paperSize;
    }

    public CreateOfficeConversionTaskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateOfficeConversionTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateOfficeConversionTaskRequest setQuality(Long quality) {
        this.quality = quality;
        return this;
    }
    public Long getQuality() {
        return this.quality;
    }

    public CreateOfficeConversionTaskRequest setScalePercentage(Long scalePercentage) {
        this.scalePercentage = scalePercentage;
        return this;
    }
    public Long getScalePercentage() {
        return this.scalePercentage;
    }

    public CreateOfficeConversionTaskRequest setSheetCount(Long sheetCount) {
        this.sheetCount = sheetCount;
        return this;
    }
    public Long getSheetCount() {
        return this.sheetCount;
    }

    public CreateOfficeConversionTaskRequest setSheetIndex(Long sheetIndex) {
        this.sheetIndex = sheetIndex;
        return this;
    }
    public Long getSheetIndex() {
        return this.sheetIndex;
    }

    public CreateOfficeConversionTaskRequest setShowComments(Boolean showComments) {
        this.showComments = showComments;
        return this;
    }
    public Boolean getShowComments() {
        return this.showComments;
    }

    public CreateOfficeConversionTaskRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateOfficeConversionTaskRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateOfficeConversionTaskRequest setSources(java.util.List<CreateOfficeConversionTaskRequestSources> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<CreateOfficeConversionTaskRequestSources> getSources() {
        return this.sources;
    }

    public CreateOfficeConversionTaskRequest setStartPage(Long startPage) {
        this.startPage = startPage;
        return this;
    }
    public Long getStartPage() {
        return this.startPage;
    }

    public CreateOfficeConversionTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateOfficeConversionTaskRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateOfficeConversionTaskRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateOfficeConversionTaskRequest setTargetURIPrefix(String targetURIPrefix) {
        this.targetURIPrefix = targetURIPrefix;
        return this;
    }
    public String getTargetURIPrefix() {
        return this.targetURIPrefix;
    }

    public CreateOfficeConversionTaskRequest setTrimPolicy(TrimPolicy trimPolicy) {
        this.trimPolicy = trimPolicy;
        return this;
    }
    public TrimPolicy getTrimPolicy() {
        return this.trimPolicy;
    }

    public CreateOfficeConversionTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class CreateOfficeConversionTaskRequestSources extends TeaModel {
        /**
         * <p>The rotation angle of the image. Valid values:</p>
         * <ul>
         * <li><p>0 (default)</p>
         * </li>
         * <li><p>90</p>
         * </li>
         * <li><p>180</p>
         * </li>
         * <li><p>270</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Rotate")
        public Long rotate;

        /**
         * <p>The OSS address of the source image.</p>
         * <p>The OSS address must be in the oss\://${Bucket}/${Object} format. ${Bucket} is the name of the OSS bucket that is in the same region as the current project. ${Object} is the full path of the file, including the file name extension.</p>
         * <p>Supported image formats: jpg, jp2, png, tiff, webp, bmp, and svg.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://examplebucket/sampleobject.jpg</p>
         */
        @NameInMap("URI")
        public String URI;

        public static CreateOfficeConversionTaskRequestSources build(java.util.Map<String, ?> map) throws Exception {
            CreateOfficeConversionTaskRequestSources self = new CreateOfficeConversionTaskRequestSources();
            return TeaModel.build(map, self);
        }

        public CreateOfficeConversionTaskRequestSources setRotate(Long rotate) {
            this.rotate = rotate;
            return this;
        }
        public Long getRotate() {
            return this.rotate;
        }

        public CreateOfficeConversionTaskRequestSources setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
