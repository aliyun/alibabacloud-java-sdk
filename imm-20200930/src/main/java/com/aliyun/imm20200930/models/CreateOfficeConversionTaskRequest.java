// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateOfficeConversionTaskRequest extends TeaModel {
    /**
     * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
     * <p>The authorization chain settings. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The ending page for document conversion. The default value is -1, which converts the file until the last page of the file.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the source is a spreadsheet file, specify the index number of the corresponding sheet instead.</p>
     * </li>
     * <li><p>If you convert a large number of pages within the document, we recommend that you split the pages into several document conversion tasks to prevent conversion timeouts.</p>
     * </li>
     * <li><p>This parameter takes effect only when you convert the file into an image. It does not take effect when you convert the file into a PDF or TXT file.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("EndPage")
    public Long endPage;

    /**
     * <p>Specifies whether to return only the first resulting image when you convert a spreadsheet document to images. The number of rows and the number of columns in the first image are determined by the automatic splitting process. Valid values:</p>
     * <ul>
     * <li>false (default): does not return only the first resulting image. All the resulting images are returned.</li>
     * <li>true: returns only the first resulting image. A thumbnail is generated.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>LongPicture</strong> parameter is set to <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FirstPage")
    public Boolean firstPage;

    /**
     * <p>Specifies whether to convert all rows of a spreadsheet document to one single image or a single-page PDF document when you convert the table document to an image or a PDF document. Valid values:</p>
     * <ul>
     * <li>false (default): converts all rows of the document to multiple images or a multi-page PDF document. This is the default value.</li>
     * <li>true: converts all rows of the document to one single image or a single-page PDF document.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FitToHeight")
    public Boolean fitToHeight;

    /**
     * <p>Specifies whether to convert all columns of a spreadsheet document to one single image or a single-page PDF document when you convert the spreadsheet file to an image or a PDF document. Valid values:</p>
     * <ul>
     * <li>false (default): converts all columns of the document to multiple images or a multi-page PDF document.</li>
     * <li>true: converts all columns of the document to one single image or a single-page PDF document.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FitToWidth")
    public Boolean fitToWidth;

    /**
     * <p>Specifies whether to retain line feeds in the output file when a document is converted to a text file. Valid values:</p>
     * <ul>
     * <li>false (default): does not retain the line feeds.</li>
     * <li>true: retains the line feeds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HoldLineFeed")
    public Boolean holdLineFeed;

    /**
     * <p>The dots per inch (DPI) of output images. Valid values: 96 to 600. Default value: 96.</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("ImageDPI")
    public Long imageDPI;

    /**
     * <p>Specifies whether to convert the document to a long image. Valid values:</p>
     * <ul>
     * <li>false (default): does not convert the document to a long image.</li>
     * <li>true: converts the document to a long image.</li>
     * </ul>
     * <blockquote>
     * <p> You can convert up to 20 pages of a document into a long image. If you convert more than 20 pages to a long image, an error may occur.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LongPicture")
    public Boolean longPicture;

    /**
     * <p>Specifies whether to convert the document to a long text file. Valid values:</p>
     * <ul>
     * <li>false (default): does not convert the document to a long text file. Each page of the document is converted to a text file.</li>
     * <li>true: converts the entire document to a long text file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LongText")
    public Boolean longText;

    /**
     * <p>The maximum number of spreadsheet columns to be converted to an image. By default, all columns within the spreadsheet file are converted.</p>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>LongPicture</strong> parameter is set to <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxSheetColumn")
    public Long maxSheetColumn;

    /**
     * <p>The maximum number of spreadsheet rows to be converted to an image. By default, all rows within the spreadsheet file are converted.</p>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>LongPicture</strong> parameter is set to <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxSheetRow")
    public Long maxSheetRow;

    /**
     * <p>The notification settings. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The numbers of pages to be converted. This parameter takes precedence over the StartPage and EndPage parameters. The value of this parameter can be in different formats:</p>
     * <ul>
     * <li>If you specify pages separately by page number, separate page numbers with commas (,). Example: 1,2</li>
     * <li>If you specify consecutive pages by using a page range, connect the starting and ending page numbers with a hyphen (-). Example: 1,2-4,7</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1,2-4,7</p>
     */
    @NameInMap("Pages")
    public String pages;

    /**
     * <p>Specifies whether to place sheets of paper horizontally for converting a spreadsheet document to images. Conversion to images is similar to printing the content on a sheet of paper. Valid values:</p>
     * <ul>
     * <li>false (default): does not place sheets of paper horizontally. Paper sheets are placed vertically.</li>
     * <li>true: places sheets of paper horizontally.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PaperHorizontal")
    public Boolean paperHorizontal;

    /**
     * <p>The paper size for converting a spreadsheet document to images. Conversion to images is similar to printing the content on a sheet of paper. Valid values:</p>
     * <ul>
     * <li>A0</li>
     * <li>A2</li>
     * <li>A4 (default)</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>FitToHeight</strong> and <strong>FitToWidth</strong> parameters are specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>A4</p>
     */
    @NameInMap("PaperSize")
    public String paperSize;

    /**
     * <p>The password that protects the source document. To convert a password-protected document, specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The quality of the output file. Valid values: 0 to 100. A smaller value indicates lower quality and better conversion performance. By default, the system specifies an appropriate value that provides an optimal balance between the quality and conversion performance based on the document content.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Quality")
    public Long quality;

    /**
     * <p>The percentage scale relative to the source document. Valid values: 20 to 200. The default value is 100, which indicates that the document is not scaled.</p>
     * <blockquote>
     * <p> A value that is less than 100 indicates a size reduction. A value that is greater than 100 indicates an enlargement.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ScalePercentage")
    public Long scalePercentage;

    /**
     * <p>The number of sheets to be converted to an image. By default, all sheets within the spreadsheet file are converted.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SheetCount")
    public Long sheetCount;

    /**
     * <p>The index number of the sheet to be converted to an image. The value ranges from 1 to the index number of the last sheet. By default, the conversion starts from the first sheet.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SheetIndex")
    public Long sheetIndex;

    /**
     * <p>Specifies whether to display comments in resulting images when a text document is converted to images. Valid values:</p>
     * <ul>
     * <li>false (default): does not display comments in resulting images.</li>
     * <li>true: displays comments in resulting images.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowComments")
    public Boolean showComments;

    /**
     * <p>The name extension of the source file. By default, the type of the source file is determined based on the name extension of the source object in OSS. If the object in OSS does not have a name extension, you can specify this parameter. Valid values:</p>
     * <ul>
     * <li>Text documents: doc, docx, wps, wpss, docm, dotm, dot, dotx, and html</li>
     * <li>Presentation documents: pptx, ppt, pot, potx, pps, ppsx, dps, dpt, pptm, potm, ppsm, and dpss</li>
     * <li>Spreadsheet documents: xls, xlt, et, ett, xlsx, xltx, csv, xlsb, xlsm, xltm, and ets</li>
     * <li>PDF documents: pdf</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>doc</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The URI of the source file.</p>
     * <p>Specify the OSS URI in the oss://${Bucket}/${Object} format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Object}</code> is the path of the object with the extension included.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("Sources")
    public java.util.List<CreateOfficeConversionTaskRequestSources> sources;

    /**
     * <p>The starting page for document conversion. Default value: 1.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the document is a spreadsheet file, specify the index number of the corresponding sheet instead.</p>
     * </li>
     * <li><p>This parameter takes effect only when you convert the file to an image format. It does not take effect when you convert the file into a PDF or TXT file.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StartPage")
    public Long startPage;

    /**
     * <p>The custom tags in dictionary format. You can use the custom tags to search for the task.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The format of the output file. Valid values:</p>
     * <ul>
     * <li>png: a PNG image.</li>
     * <li>jpg: a JPG image.</li>
     * <li>pdf: a PDF file.</li>
     * <li>txt: a TXT file. You can specify this value to extract the text content of the source document. Only presentation, text, or spreadsheet documents can be converted to a TXT file. If the source document is a spreadsheet, only one TXT is created and sheet-related parameters do not take effect.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>png</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The address template of the output file.</p>
     * <p>Specify the value in the <code>oss://{bucket}/{tags.custom}/{dirname}/{barename}.{autoext}</code> format. For more information, see <a href="https://help.aliyun.com/document_detail/465762.html">TargetURI template</a>.</p>
     * <blockquote>
     * <p> Specify at least one of the TargetURI and TargetURIPrefix parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://{bucket}/{tags.custom}/{dirname}/{barename}.{autoext}</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>The prefix of the storage address of the output file.</p>
     * <p>Specify the prefix in the <code>oss://${Bucket}/${Prefix}/</code> format, where <code>${Bucket}</code> is the name of the bucket in the same region as the current project and <code>${Prefix}</code> is the prefix of the output file.</p>
     * <blockquote>
     * <p> Specify at least one of the TargetURI and TargetURIPrefix parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket1/</p>
     */
    @NameInMap("TargetURIPrefix")
    public String targetURIPrefix;

    /**
     * <p>The trim policy for converting a spreadsheet file. Empty rows and columns may generate blank spaces in the output file if no appropriate trim policy is specified.</p>
     */
    @NameInMap("TrimPolicy")
    public TrimPolicy trimPolicy;

    /**
     * <p>The custom information, which is returned in an asynchronous notification and facilitates notification management. The maximum information length is 2,048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;file_id&quot;: &quot;abc&quot;}</p>
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
        @NameInMap("Rotate")
        public Long rotate;

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
